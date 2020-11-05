package ex04controlstatement;
/*
문제2) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 작성하시오. 
단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다.
파일명 : Qu_04_07.java

실행결과]
3+6+7+~~~~~~=????

 */
public class Qu_04_07 {

	public static void main(String[] args) {
		
		// 1~100반복
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			// 3의 배수이거나 7의 배수
			if(i%3==0 || i%7==0) {
				// 3과 7의 공배수가 아닌 정수
				if(i%(3*7)!=0) {
					sum += i;
					System.out.print(i+"+");
				}
			}
 		}
		System.out.println("="+ sum);
	}
}

