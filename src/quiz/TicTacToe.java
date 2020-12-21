package quiz;

import java.util.Scanner;

public class TicTacToe {
	
	/*
		_ | _ | _
		_ | _ | _
		  |   |
		  
		[0][0], [0][2], [0][4]
		[1][0], [1][2], [1][4]
		[2][0], [2][2], [2][4]

*/
	
	public static void main(String[] args) {

		char[][] board = new char[3][3];//게임판을 나타내는 2차원 배열
		int x, y;
		
		Scanner scan = new Scanner(System.in);
		
		//게임판을 나타내는 2차원 배열을 초기화
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				board[i][j] = ' ';
		
		do {
			//게임판을 그린다.
			for(int i=0; i<3; i++) {
				System.out.println(" " + board[i][0] + "| "
						+ board[i][1] + "| " + board[i][2]);
				if(i != 2)
					System.out.println("--|--|--");
			}
			System.out.println("다음 수의 좌표를 입력하시오: ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			//사용자가 놓은 위치를 검사
			if(board[x][y] != ' ') {
				System.out.println("잘못된 위치입니다.");
				continue;
			}else {
				board[x][y] = 'X';
			}
			
			//컴퓨터가 놓은 위치를 결정
			int i= 0, j=0;
			outer :
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					if(board[i][j] == ' ') break outer;
				}
			}
			if(i < 3 && j < 3) {
				board[i][j] = 'O';
			}
		}
		while(true);
	}
}
