package quiz;

import java.util.Random;

public class QuBubbleSort {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arrNumber = new int[10];
		
		for(int i=0; i<arrNumber.length; i++) {
		arrNumber[i] = (int)((Math.random()*100) % 99);
		System.out.printf("%d ", arrNumber[i]);
		}
		
		int temp;
		
		for(int i=0; i<arrNumber.length; i++) {
				if(arrNumber[i]>arrNumber[i+1]) {
					System.out.println(arrNumber[i]+"와 "+
								arrNumber[i+1]+"을 교환");
					temp = arrNumber[i];
					arrNumber[i] = arrNumber[i+1];
					arrNumber[i+1] = temp;
					System.out.println(arrNumber[i]+" ");
				}
				else {
					System.out.println("교환없음");
				}
		}
		
//		callByReference(arrNumber);
		
		for(int i=0; i<arrNumber.length; i++) {
			System.out.println(arrNumber[i]+" ");
		}
	}
//	static void callByReference(int[] ref) {
//		int temp;
//		int i=0;
//		
//		temp = ref[i];
//		ref[i] = ref[i+1];
//		ref[i+1] = temp;
//	}

}
