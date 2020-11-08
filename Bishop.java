import java.util.ArrayList;

public class Bishop extends Piece{
	private String prefix = "B";
	
	public Bishop(boolean isWhite) {
		this.isWhite = isWhite;
	}

	@Override
	protected int[][] validWhiteMoves(int[] pos, Piece[][] board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		
		// Stores the different ways in which the bishop can move diagonally
		int[][] possibleMoves = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
		
		for (int i = 0; i < possibleMoves.length; i++) {
			// If there's no piece on the diagonal, makes sure to stop
			try {
				int rank = pos[0] + possibleMoves[i][0];
				int file = pos[1] + possibleMoves[i][1];
				
				// While there's no piece in the possible square to move to, it will add the square to the array of possible moves
				while (board[rank][file] == null) {
					int[] r = {rank, file};
					moves.add(r);
					
					rank += possibleMoves[i][0];
					file += possibleMoves[i][1];
				}
				
				// If the piece on the diagonal is black, it is a valid move
				if (board[rank][file].isWhite() == false) {
					int[] r = {rank, file};
					moves.add(r);
				}
			} catch (ArrayIndexOutOfBoundsException e) {}
		}
		
		int[][] r = new int[moves.size()][2];
		return moves.toArray(r);
	}

	@Override
	protected int[][] validBlackMoves(int[] pos, Piece[][] board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		
		// Stores the different ways in which the bishop can move diagonally
		int[][] possibleMoves = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
		
		for (int i = 0; i < possibleMoves.length; i++) {
			// If there's no piece on the diagonal, makes sure to stop
			try {
				int rank = pos[0] + possibleMoves[i][0];
				int file = pos[1] + possibleMoves[i][1];
				
				// While there's no piece in the possible square to move to, it will add the square to the array of possible moves
				while (board[rank][file] == null) {
					int[] r = {rank, file};
					moves.add(r);
					
					rank += possibleMoves[i][0];
					file += possibleMoves[i][1];
				}
				
				// If the piece on the diagonal is white, it is a valid move
				if (board[rank][file].isWhite()) {
					int[] r = {rank, file};
					moves.add(r);
				}
			} catch (ArrayIndexOutOfBoundsException e) {}
		}
		
		int[][] r = new int[moves.size()][2];
		return moves.toArray(r);
	}
	
	
}
