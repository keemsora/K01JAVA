package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{
	
	public InsertShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			//1. 쿼리문준비 : 값의 세팅이 필요한 부분을 ?(인파라미터)로 대체한다.
			String query = "INSERT INTO sh_goods VALUES (goods_seq.nextval,?,?,sysdate,?)";
			
			//2. prepared객체생성 : 생성 시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//3. DB에 입력할 값을 사용자로부터 입력받음
			
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			
			//5. 쿼리실행을 위해 prepared객체를 실행한다.
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다.");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	public static void main(String[] args) {
		new InsertShop().execute();
		
	}
}
