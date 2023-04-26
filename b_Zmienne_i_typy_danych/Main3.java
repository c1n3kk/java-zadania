
public class Main3 {

	public static void main(String[] args) {
        long nr1 = 334L;
        double nr2 = 666.666D;
		/* dodając liczbę całkowitą (int lub long) do zmiennoprzecinkowej (double)
		 * otrzymamy liczbę zmiennoprzecinkową (double) */
        double result = 0D;
        result = nr1 + nr2;
        System.out.println(result);
	}

}
