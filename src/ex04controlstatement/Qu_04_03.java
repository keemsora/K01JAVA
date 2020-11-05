package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math;
		System.out.print("국어:");
		kor = scanner.nextInt();
		System.out.print("영어:");
		eng = scanner.nextInt();
		System.out.print("수학:");
		math = scanner.nextInt();
		
		int avg = (kor + eng + math) / 3;
		System.out.println("평균점수:"+ avg);
		
		avg = (kor + eng + math) / (3 * 10);
		System.out.print("학점:");
		switch(avg) {
			case 10:case 9:
			System.out.println("A");break;
			case 8:
			System.out.println("B");break;
			case 7:
			System.out.println("C");break;
			case 6:
		    System.out.println("D");break;
		    default:
		    System.out.println("F");break;
		}
	 		
	}

}
