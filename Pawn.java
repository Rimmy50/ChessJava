import java.util.ArrayList;

public class Pawn extends Piece {
	private String prefix = null;
	
	public Pawn(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	@Override
	protected int[][] validWhiteMoves(int[] pos, Piece[][] board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		
		// If the square in front of it is empty, it is a valid move
		if (pos[1] > 0 && board[pos[0] - 1][pos[1]] == null) {
			int[] r = {pos[0] - 1, pos[1]};
			moves.add(r);
		}
		
		// If the square to the left diagonal has a black piece, it is a valid move
		try {
			if (board[pos[0] - 1][pos[1] - 1].isWhite() == false) {
				int[] r = {pos[0] - 1, pos[1] - 1};
				moves.add(r);
			}
		} catch (Exception e) {}
		
		// If the square to the right diagonal has a black piece, it is a valid move
		try {
			if (board[pos[0] - 1][pos[1] + 1].isWhite() == false) {
				int[] r = {pos[0] - 1, pos[1] + 1};
				moves.add(r);
			}
		} catch (Exception e) {}
		
		// If the pawn is on the 2nd rank and the square 2 squares in front of it is empty, it is a valid move
		if (pos[0] == 6 && board[pos[0] - 2][pos[1]] == null) {
			int[] r = {pos[0] - 2, pos[1]};
			moves.add(r);
		}
		
		int[][] r = new int[moves.size()][2];
		return moves.toArray(r);
	}
	
	@Override
	protected int[][] validBlackMoves(int[] pos, Piece[][] board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		
		// If the square in front of it is empty, it is a valid move
		if (pos[1] < 7 && board[pos[0] + 1][pos[1]] == null) {
			int[] r = {pos[0] - 1, pos[1]};
			moves.add(r);
		}
		
		// If the square to the left diagonal has a white piece, it is a valid move
		try {
			if (board[pos[0] + 1][pos[1] - 1].isWhite()) {
				int[] r = {pos[0] - 1, pos[1] - 1};
				moves.add(r);
			}
		} catch (ArrayIndexOutOfBoundsException e) {}
		
		// If the square to the right diagonal has a white piece, it is a valid move
		try {
			if (board[pos[0] + 1][pos[1] + 1].isWhite()) {
				int[] r = {pos[0] - 1, pos[1] + 1};
				moves.add(r);
			}
		} catch (ArrayIndexOutOfBoundsException e) {}
		
		// If the pawn is on the 2nd rank and the square 2 squares in front of it is empty, it is a valid move
		if (pos[0] == 1 && board[pos[0] + 2][pos[1]] == null) {
			int[] r = {pos[0] - 2, pos[1]};
			moves.add(r);
		}
		
		int[][] r = new int[moves.size()][2];
		return moves.toArray(r);
	}	
	

}
