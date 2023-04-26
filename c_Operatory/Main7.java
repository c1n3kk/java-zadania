
public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println(result);
		nr1 = 10;
		result = nr1 + nr2;
		System.out.println(result); 
		/* wynik jest inny niż w pkt.2 gdyż najpierw wyświetlilismy pierwszy wynik sumy 4 + 7 = 11,
		 * a dopiero potem zmienilismy wartość nr1 na 10 i obliczylismy wynik na nowo 10 + 4 = 14*/
	}

}
