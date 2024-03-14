package lab4;

import java.util.Arrays;

public class MyScoreboard {
	private int numEntries = 0;              // number of actual entries
	private GameEntry[] board;               // array of game entries (names & scores)
	public MyScoreboard(int capacity) {
		board = new GameEntry[capacity];
	}

	// Add the entry at the end when there is space
	public void add(GameEntry e) {
		if (numEntries < board.length) {
			numEntries++;
			int j = numEntries - 1;
			board[j] = e;
		}
	}

	// Remove and return the entry at index i.
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= numEntries)
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		GameEntry temp = board[i];
		board[i] = board[numEntries-1];
		numEntries--;
		return temp;
	}


	// A facility that shows the board.
	public void printBoard() {
		for (int j = 0; j < numEntries; j++) {
			System.out.print(board[j].toString() + " ");
		}
		System.out.println();
		System.out.println();
	}

	// The main method
	public static void main(String[] args) {
		// Initialize the score board
		MyScoreboard myboard = new MyScoreboard(5);
		String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};
		int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};
		for (int i=0; i < names.length; i++) {
			GameEntry gE = new GameEntry(names[i], scores[i]);
			myboard.add(gE);
		}
		myboard.printBoard();
		
		// Testing adding and removing
		GameEntry a = myboard.remove(0);
		System.out.println("Remove " + a.toString());
		myboard.printBoard();
		
		a = new GameEntry("Alice", 999);
		System.out.println("Add " + a.toString());
		myboard.add(a);
		myboard.printBoard();
		
		a = new GameEntry("Joe", 99);
		System.out.println("Add " + a.toString());
		myboard.add(a);
		myboard.printBoard();

		a = myboard.remove(2);
		System.out.println("Remove " + a.toString());
		myboard.printBoard();
		
		a = new GameEntry("Joe", 99);
		System.out.println("Add " + a.toString());
		myboard.add(a);
		myboard.printBoard();
	}
}
