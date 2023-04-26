
public class Main16 {

    public static void main(String[] args) {
		int x = 420;
		int y = 168;
		int a, b, gcd;
		a = x;
		b = y;
		
		while (b != 0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}

		System.out.println("Dla liczb " + x + " i " + y + " GDC to: " + a + ".");
	}
}
