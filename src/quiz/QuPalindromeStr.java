package quiz;

import java.util.Scanner;

public class QuPalindromeStr {
	
	public static void palindromeStr(String word) {
		
		char[] arr = new char[30];
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arr[arr.length-1-i]) {
			}
			else {
				break;
			}
			cnt++;
		}
		if(cnt==0) 
			System.out.println("입력한 단어는 회문이 아닙니다.");
		else
			System.out.println("입력한 단어는 회문입니다.");
		
	}

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.print("회문인지 판단할 단어를 입력해 주세요:");
		String word = scanner.nextLine();
		
		
		palindromeStr(word);
	}

}
