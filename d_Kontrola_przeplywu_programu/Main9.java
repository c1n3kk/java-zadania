
public class Main9 {

    public static void main(String[] args){
		int n = 5;

		for (int i = 1; i <= n; i++) {
			String row = "";

			for (int j = 1; j <= n; j++) {
				String character = "";
				if (j <= i) {
					character = "*";
				} else {
					character = Integer.toString(j);
				}
				// character = (j <= i ? "*" : Integer.toString(j));
				row += character + " ";
			}
			System.out.print(row + "\n");
		}
    }

}
