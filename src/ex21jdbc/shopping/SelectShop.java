package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.statement.SelectQuery;

public class SelectShop extends ConnectDB{
	
	public SelectShop() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void execute() {
		try {
			stmt = con.createStatement();
			
			String query = " SELECT g_idx, goods_name, "
					+ " to_char(goods_price, '999,999,000'), "
					+ " to_char(regidate, 'yyyy-mm-dd hh24:mi') d1, "
					+ " p_code "
					+ " FROM sh_goods "
					+ " WHERE goods_name LIKE '%노트북%'";
			
			rs = stmt.executeQuery(query);
			
			
			while(rs.next()) {
				int g_idx = rs.getInt(1);//id컬럼
				String goods_name = rs.getString("goods_name");
				String goods_price = rs.getString(3);
				String regidate = rs.getString("d1");
				int p_code = rs.getInt("p_code");
				
				
				System.out.printf("%s %s %s %s %s\n",
						g_idx, goods_name, goods_price, regidate, p_code);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close(); //DB자원반납
		}
	}


	public static void main(String[] args) {
		SelectShop selectSQL = new SelectShop();
		selectSQL.execute();
	}

}
