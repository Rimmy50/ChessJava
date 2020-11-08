public class Board {
	private Piece[][] board = new Piece[8][8];
	
	public Board() {
		this.initialize();
	}
	
	private void initialize() {
		this.board[3][2] = new Pawn(true);
	}
	
	public Piece[][] getBoard() {
		return this.board;
	}
	
}
