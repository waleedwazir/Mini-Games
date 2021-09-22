import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameBoard {
	
	 static ArrayList<Integer> playerPos1 = new ArrayList<Integer>();
	 static ArrayList<Integer> playerPos2 = new ArrayList<Integer>();
	
	 			
	public static void printBoard(char[][] Board) {

		for(char[] row : Board) {
			for( char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
	
	public static String CheckWinner() {
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 2, 3);
		List midCol = Arrays.asList(4, 5, 6);
		List rightCol = Arrays.asList(7, 8, 9);
		List Cross1 = Arrays.asList(1, 5, 9);
		List Cross2 = Arrays.asList(7, 5, 3);
		
		List<List> won = new ArrayList<List>();
		won.add(topRow);
		won.add(midRow);
		won.add(botRow);
		won.add(midCol);
		won.add(leftCol);
		won.add(rightCol);
		won.add(Cross1);
		won.add(Cross2);

		for(List l : won) {
			if(playerPos1.containsAll(l)) {
				return "Player 1 Wins!!";
			}else if(playerPos2.containsAll(l)) {
				return "Player 2 Wins!!";
			}else if(playerPos1.size() + playerPos2.size() == 9) {
				return "DRAW!";
			}
		} 

				
		return "";
	}
	
	public static void placePiece(char[][] Board, int pos, String user) {
		
		char symbol = ' ';
		
		if(user.equals("player1")) {
			symbol = 'X';
			playerPos1.add(pos);
		}else if(user.equals("player2")) {
			symbol = 'O';
			playerPos2.add(pos);
		}
			
		
		
		switch(pos) {
		case 1:
			Board[0][0] = symbol;
			break;
		case 2:
			Board[0][2] = symbol;
			break;
		case 3:
			Board[0][4] = symbol;
			break;
		case 4:
			Board[2][0] = symbol;
			break;
		case 5:
			Board[2][2] = symbol;
			break;
		case 6:
			Board[2][4] = symbol;
			break;
		case 7:
			Board[4][0] = symbol;
			break;
		case 8:
			Board[4][2] = symbol;
			break;
		case 9:
			Board[4][4] = symbol;
			break;
			
	 }
		printBoard(Board);
		
	}
	
	public static void main(String[] arg) {
		
		System.out.println("TIC TAC TOE");
		
		char[][] Board = {{' ','|',' ','|',' '}, 
				          {'-','+','-','+','-'},
				          {' ','|',' ','|',' '},
				          {'-','+','-','+','-'},
				          {' ','|',' ','|',' '}};
		
		printBoard(Board);
		
		while(true) {
			
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Placement for Player1 (1-9): ");
		int pos = input.nextInt();
		while(playerPos1.contains(pos) || playerPos2.contains(pos)) {
			System.out.println("Position taken! Enter different Position: ");
			pos = input.nextInt();
		}
		
		placePiece(Board, pos, "player1");
		
		String result = CheckWinner();
		if(result.length() > 0) {
			System.out.println(result);
			break;
		}
		
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Placement for Player2 (1-9): ");
		int pos2 = input2.nextInt();
		while(playerPos1.contains(pos2) || playerPos2.contains(pos2)) {
			System.out.println("Position taken! Enter different Position: ");
			pos2 = input2.nextInt();
		}
		
		
		placePiece(Board, pos2, "player2");
		
		
	
		if(result.length() > 0) {
			System.out.println(result);
			break;
		}
				
	}
 }
}
