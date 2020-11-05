package ex02variable;

public class Qu_02_01 {

	public static void main(String[] args) {
		/*
		int kor=89, eng=99, math=78;
		System.out.println("국어:"+kor
					+", 영어:"+eng
					+", 수학:"+math);
		System.out.println("총점:"+(kor+eng+math));
		*/
		
		int kor=89, eng=99, math=78;
		int total;
		
		total = kor + eng + math;
		
		System.out.printf("국어:%d, 영어:%d, 수학%d\n",kor,eng,math);
		System.out.println("총점:"+total);
	}	
		
		

}
