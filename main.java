import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		Piece test = new Bishop(true);
		Board board = new Board();
		int[][] r = test.validMoves(test.convertStringToPos("f2"), board.getBoard());
		for (int i = 0; i < r.length; i++) {
			System.out.println(test.convertPosToString(r[i]));
		}
	}
}
