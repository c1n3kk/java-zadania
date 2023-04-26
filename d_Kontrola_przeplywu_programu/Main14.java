
public class Main14 {

    public static void main(String[] args) {
		int n = 3;
		int result;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				result = i * j;
				System.out.println(i + " x " + j + " = " + result);
			}
			System.out.println("");
		}
    }

}
