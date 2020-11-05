package quiz;

import java.util.Scanner;

public class QuBinaryNumber {
	
	public static void binaryNum(int gNum) {
		
		int[] arr = new int[10];
		int i = 0;
		
		while(gNum > 0) {
			arr[i] = gNum % 2;
			gNum /= 2;
			i++;
			
		}
		
		i--;
		
		for(; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2진수로 변환할 정수를 입력하세요:");
		int num = scanner.nextInt();
		
		binaryNum(num);

	}

}
