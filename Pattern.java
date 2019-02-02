package core.java;

public class Pattern {

	public static void main(String[] args) {

		int i, j;

		/* System.out.println("Hello"); */
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("----------------------------------");

		int a, b;
		for (a = 1; a < 10; a++) {
			for (b = 1; b < a; b++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("----------------------------------");

	}

}
