
public class HelloBoss {

	public HelloBoss() {
		// TODO Auto-generated constructor stub
	}

	public static String check(Integer num) {

		if (num % 15 == 0) {
			return "Hellojay";
		} else if (num % 3 == 0) {
			return "Hello";

		} else if (num % 5 == 0) {
			return "Jaya";
		} else {
			return num.toString();
		}

	}

	public static void main(String args[]) {
		System.out.println(check(3));

	}

}
