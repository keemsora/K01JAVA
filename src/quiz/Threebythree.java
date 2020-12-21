package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Threebythree {
	

	
	public static void print(String[][] puzzle) {
		System.out.println("===================");
		for(int i=0; i<puzzle.length; i++) {
			for(int j=0; j<puzzle[i].length; j++) {
				System.out.print(puzzle[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void shuffle(String[][] puzzle) {
		
		Random random = new Random();
		String temp;
		int count = 0;
		
		while(count<=1) {
			for(int i=0; i<puzzle.length; i++) {
				for(int j=0; j<puzzle[i].length; j++) {
					int a = (int) (Math.random()*puzzle.length);
					int b = (int) (Math.random()*puzzle[i].length);
					
					temp = puzzle[i][j];
					puzzle[i][j] = puzzle[a][b];
					puzzle[a][b] = temp;
					
				}
			}
			count++;
		}
		print(puzzle);
		System.out.println("===================");
		System.out.println("[이동] a:Left d:Right w:Up s:Down");
		System.out.println("[종료] x:Exit");
		System.out.println("키를 입력해주세요 :");
		
	}
	
	public static void gameStart(String[][] standard, String[][] puzzle) {
		
		boolean flag = false;
		boolean stop = true;
		Scanner scan = new Scanner(System.in);
		shuffle(puzzle);
		
		while(flag=true) {
			
			String ans = scan.nextLine();
			
			switch(ans) {
			case "a":case "A":case "ㅁ":
				for(int i=0; i<puzzle.length; i++) {
					for(int j=0; j<puzzle[i].length; j++) {
						if(puzzle[i][j]=="x") {
							if(0<j) {
								String temp = puzzle[i][j];
								puzzle[i][j] = puzzle[i][j-1];
								puzzle[i][j-1]=temp;
							}
							else {
								System.out.println("이동불가");
							}	
							
						}else {
						continue;
						}
					}
				}
				
			break;
			case "s":case "S":case "ㄴ":
				for(int i=0; i<puzzle.length; i++) {
					for(int j=0; j<puzzle[i].length; j++) {
						if(puzzle[i][j]=="x") {
							if(i<2) {
								String temp = puzzle[i][j];
								puzzle[i][j] = puzzle[i+1][j];
								puzzle[i+1][j]=temp;
								stop = false;
								break;
							}
							else {
								System.out.println("이동불가");
							}	
							
						}else {
						continue;
						}
					}
					if(stop==false) {
						break;
						
					}
				}
				stop=true;
			break;
			case "w":case "W":case "ㅈ":
				for(int i=0; i<puzzle.length; i++) {
					for(int j=0; j<puzzle[i].length; j++) {
						if(puzzle[i][j]=="x") {
							if(0<i) {
								String temp = puzzle[i][j];
								puzzle[i][j] = puzzle[i-1][j];
								puzzle[i-1][j]=temp;
							}
							else {
								System.out.println("이동불가");
							}	
							
						}else {
						continue;
						}
					}
				}
			break;
			case "d":case "D":case "ㅇ":
				for(int i=0; i<puzzle.length; i++) {
					for(int j=0; j<puzzle[i].length; j++) {
						if(puzzle[i][j]=="x") {
							if(j<2) {
								String temp = puzzle[i][j];
								puzzle[i][j] = puzzle[i][j+1];
								puzzle[i][j+1]=temp;
								break;
							}
							else {
								System.out.println("이동불가");
							}	
							
						}else {
						continue;
						}
					}
				}
			break;
			}
			print(puzzle);
			System.out.println("===================");
			
			
			if(Arrays.deepEquals(standard, puzzle)) {
				System.out.println("정답입니다 @)---------");
				System.out.println("다시 시작하시겠습니까? 재시작(1), 종료(2)");
				int restart = scan.nextInt();
				if(restart==1) {
					flag=false;
				}
				else if(restart==2) {
					return;
				}
			}
			System.out.println("[이동] a:Left d:Right w:Up s:Down");
			System.out.println("[종료] x:Exit");
			System.out.println("키를 입력해주세요 :");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String[][] standard = {{"1", "2", "3"},
				{"4", "5", "6"},
				{"7", "8", "x"}};
		String[][] puzzle = {{"1", "2", "3"},
				{"4", "5", "6"},
				{"7", "8", "x"}};	
		print(standard);
		gameStart(standard, puzzle);
		
		
	}
}
