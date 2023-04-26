
public class Main13 {

    public static void main(String[] args) {
		int points = 55;
		String grade = "";

		if (points < 0)
		{
			System.out.println("Liczba punktów mniejsza niż 0.");
			return;
		}

		if (points > 100) {
			System.out.println("Liczba punktów większa niż 100.");
			return;
		}

		if (points <= 39) {
			grade = "niedostateczna";
		} else if (points >= 40 && points <= 54) {
			grade = "dopuszczająca";
		} else if (points >= 55 && points <= 69) {
			grade = "dostateczna";
		} else if (points >= 70 && points <= 84) {
			grade = "dobra";
		} else if (points >= 85 && points <= 98) {
			grade = "bardzo dobra";
		} else {
			grade = "celująca";
		}

		System.out.println("Wynik: " + points + " punkt(ów) - ocena: " + grade);
    }

}
