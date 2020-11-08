public class main {
	public static void main(String[] args) {
		int[] test = new int[2];
		try {
			System.out.println(test[-1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}
		System.out.println("Test");
	}
}
