package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
		/*
		int kor=99, eng=80, math=96;
		
		double num1 = 3.0;
		double avg1 = (kor + eng + math) / num1;
		System.out.println("평균점수(실수형)="+avg1);
		
		int num2 = 3;
		int avg2 = (kor + eng + math) / num2;
		System.out.println("평균점수(정수형)="+avg2);
		*/
		
		int k=99, e=80, m=96;
		double avg1 = (k+e+m) / 3;// 정수 /정수 => 정수의 결과
		double avg2 = (k+e+m) / 3.0;// 정수/실수 => 실수의 결과
		System.out.println("평균점수:"+avg1);
		System.out.println("평균점수:"+avg2);
	}

}
