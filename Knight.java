import java.util.ArrayList;

public class Knight extends Piece{
	private String prefix = "N";
	
	public Knight(boolean isWhite) {
		this.isWhite = isWhite;
	}

	@Override
	protected int[][] validWhiteMoves(int[] pos, Piece[][] board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		
		// Stores the different possible L shapes a Knight could possibly make
		int[][] possibleMoves = {{2, 1}, {2, -1}, {-2, -1}, {-2, 1}, {1, 2}, {1, -2}, {-1, -2}, {-1, 2}};
		
		// Checks to see if the L shape lands on an empty square or a black piece
		for (int i = 0; i < possibleMoves.length; i++) {
			int[] possiblePos = {pos[0] + possibleMoves[i][0], pos[1] + possibleMoves[i][1]};
			
			try {
				if (board[possiblePos[0]][possiblePos[1]] == null || board[possiblePos[0]][possiblePos[1]].isWhite() == false) {
					moves.add(possiblePos);
				}
			} catch (ArrayIndexOutOfBoundsException e) {}
		}
		
		int[][] r = new int[moves.size()][2];
		return moves.toArray(r);
	}

	@Override
	protected int[][] validBlackMoves(int[] pos, Piece[][] board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		
		// Stores the different possible L shapes a Knight could possibly make
		int[][] possibleMoves = {{2, 1}, {2, -1}, {-2, -1}, {-2, 1}, {1, 2}, {1, -2}, {-1, -2}, {-1, 2}};
		
		// Checks to see if the L shape lands on an empty square or a white piece
		for (int i = 0; i < possibleMoves.length; i++) {
			int[] possiblePos = {pos[0] + possibleMoves[i][0], pos[1] + possibleMoves[i][1]};
			
			try {
				if (board[possiblePos[0]][possiblePos[1]] == null || board[possiblePos[0]][possiblePos[1]].isWhite()) {
					moves.add(possiblePos);
				}
			} catch (ArrayIndexOutOfBoundsException e) {}
		}
		
		int[][] r = new int[moves.size()][2];
		return moves.toArray(r);
	}
	
}
