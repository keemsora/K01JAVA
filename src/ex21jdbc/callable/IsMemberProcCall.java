package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class IsMemberProcCall extends IConnectImpl{
	
	public IsMemberProcCall() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			
			csmt = con.prepareCall("{call KosmoMemberAuth(?,?,?)}");
			
			csmt.setString(1, scanValue("회원 아이디"));
			csmt.setString(2, scanValue("회원 패스워드"));
			csmt.registerOutParameter(3, Types.NUMERIC);
			//실행
			csmt.execute();
			
			int outParamResult = csmt.getInt(3);
			switch(outParamResult) {
			case 0:
				System.out.println("회원아이디가 없어요. 회원 가입 바랍니다.");
				break;
			case 1:
				System.out.println("패스워드가 틀립니다. 비밀번호를 찾으세요.");
				break;
			case 2:
				System.out.println("회원님 반갑습니다.");
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}


	public static void main(String[] args) {
		IsMemberProcCall mapc = new IsMemberProcCall();
		mapc.execute();

	}

}
