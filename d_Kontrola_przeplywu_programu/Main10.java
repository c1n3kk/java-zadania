
public class Main10 {

    public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			String row = "";

			for (int j = 1; j <= i; j++) {
				row += "* ";
			}
			System.out.print(row + "\n");
		}
    }

}
