package ex05method;

public class QuSimpleOperation {
	
	static void arithmetic(int a, int b) {
		System.out.printf("덧셈:%d+%d=%d\n",a,b,(a+b));
		System.out.printf("뺄셈:%d-%d=%d\n",a,b,(a-b));
		System.out.printf("곱셈:%d*%d=%d\n",a,b,(a*b));
		System.out.printf("나눗셈 몫:%d/%d=%d\n",a,b,(a/b));
		// %기호를 콘솔에 출력하기 이해 이스케이프 시퀀스 사용함.
		System.out.printf("나눗셈 나머지:%d%%%d=%d\n",a,b,(a%b));
		
	}
	public static void main(String[] args) {
		arithmetic(10, 20);
	}

}
