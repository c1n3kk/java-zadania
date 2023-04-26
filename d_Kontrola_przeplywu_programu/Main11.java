
public class Main11 {

    public static void main(String[] args){
		int n = 9;

		for (int i = 1; i <= n; i++) {
			String row = "";

			for (int j = 1; j <= n; j++) {
				String character = "";
				character = (j <= i ? "*" : Integer.toString(j));
				row += character + " ";
			}
			System.out.print(row + "\n");
		}

		for (int i = n; i >= 1; i--) {
			String row = "";

			for (int j = 1; j <= n; j++) {
				String character = "";
				character = (j <= i ? "*" : Integer.toString(j));
				row += character + " ";
			}
			System.out.print(row + "\n");
		}
    }

}
