package bokang;

import bokang.sub.CheckCard1;
import bokang.sub.CheckCard2;
import bokang.sub.CheckCard3;

public class R05Class {

	public static void main(String[] args) {
		
		//체크카드 클래스 ver01
		/*
		숫자를 구분할 때 구분자로 언더바를 사용할 수 있다.
		JDK7.0부터 지원되었으며 숫자 사이에 쓰는 것만 허용된다.
		잘못된 방법]
			3._14159
			123_456_
			_123_456
			위와 같이 언더바로 시작하거나 끝날 수 없고
			소수점과 연결해서도 사용할 수 없다.
		 */
		CheckCard1 cc1 = new CheckCard1();
		cc1.cardNumber = 1111_2222_3333_4444L;
		cc1.owner = "홍길동";
		cc1.balance = 10000;
		cc1.point = 0;
		
		//5000원 결제
		cc1.payment(5000);
		//10000원 결제
		cc1.payment(10000);
		//현재상태 출력
		cc1.showState();
		
		/*********************************************************/
		//객체생성 후 초기화메소드를 통해서 멤버변수 초기화
		CheckCard2 cc2 = new CheckCard2();
		cc2.initMembers(1234_5678_9012_3456L, "김말똥",
				3000, 0);
		
		//인자생성자를 통해 객체생성과 동시에 멤버변수 초기화
		CheckCard2 cc3 = new CheckCard2(9876_5432_1098_7654L, 
				"이말년", 100000, 0);
		
		
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();
		
		cc3.charge(18000);
		cc3.payment(19000);
		cc3.showState();
		
		//멤버변수가 private으로 선언되었으므로 직접 접근 불가
		//cc2.balance = 9900;
		//cc2.owner = "아무개";
		
		//정보은닉된 멤버 접근시에는 setter를 통해서만 가능
		cc2.setBalance(9900);
		cc2.setOwner("아무개");
		
		CheckCard3 cc4 = new CheckCard3(9876_5432_1098_7654L, "최지우", 
				1000, 0);
		
		cc4.charge(1000);
		cc4.payment(10000);
		cc4.showState();
		
		CheckCard3 cc5 = new CheckCard3(1122_3344_5566_7788L, "김지수");
		
		cc5.showState();
	}

}
