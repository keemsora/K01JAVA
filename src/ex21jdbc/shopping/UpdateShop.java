package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{
	
	public UpdateShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("가격"));
			csmt.setString(3, scanValue("제품코드"));
			csmt.setString(4, scanValue("상품일련번호"));
			csmt.registerOutParameter(5, Types.NUMERIC);
			//실행
			csmt.execute();
			
			System.out.println("업데이트프로시저 실행결과:");
			System.out.println(csmt.getString(5));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	public static void main(String[] args) {
		new UpdateShop().execute();

	}

}
