
public abstract class Piece {
	protected boolean isWhite;
	
	// Returns 2D array of all valid moves in form [[file, rank], [file, rank], etc...] 
	public int[][] validMoves(int[] pos, Piece[][] board) {
		if (isWhite) {
			return validWhiteMoves(pos, board);
		} else {
			return validBlackMoves(pos, board);
		}
	}
	
	public boolean isWhite() {
		return this.isWhite;
	}
	
	private int[] convertPos(String pos) {
		int[] r = new int[2];
		
		r[1] = ((int) pos.charAt(0)) - 97;
		r[0] = 8 - Character.getNumericValue(pos.charAt(1));
		
		return r;
	}
	
	abstract protected int[][] validWhiteMoves(int[] pos, Piece[][] board);
	
	abstract protected int[][] validBlackMoves(int[] pos, Piece[][] board);
	
	
}
