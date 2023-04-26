
public class Main8 {

	public static void main(String[] args) {
		int black = 16;
		int white = 15;
		boolean blackOrWhite = (black < white ? true : false);
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = (good || bad ? true : false);
		boolean comparison = (blackOrWhite && goodOrBad ? true : false);

		System.out.println(blackOrWhite); // false - black nie jest mniejsze od white
		System.out.println(goodOrBad); // true - 'or' z wartośi 'true' i 'false' zwróci 'true' (alternatywa ligiczna)
		System.out.println(comparison); // false - 'and' z wartości 'true' i 'false' zwróci 'false' (koniunkcja)
	}

}
