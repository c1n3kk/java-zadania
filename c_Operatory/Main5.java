
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a); // a jest zwiększone o 1 (a=2), następnie a jest wyświetlone (2)
		System.out.println(a++); // a jest wyświetlone (2), następnie a jest zwiększone o 1 (a=3)
		System.out.println(a);   // a jest wyświetlone (3)
		b=a++; // b jest równe a (a=3), następnie a jest zwiększone o 1 (a=4, b=3))
		System.out.println(b); // b jest wyświetlone (3)
		b=++a; // a jest zwiększone o 1 (a=5), nastepnie b jest równe a (b=5)
		System.out.println(++a); // a jest zwiększone o 1 (a=6), następnie a jest wyświetlone (6)
	}

}
