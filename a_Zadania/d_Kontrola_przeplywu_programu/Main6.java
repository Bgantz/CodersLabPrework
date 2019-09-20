
public class Main6 {

	public static void main(String[] args) {

		int n = 25;

		for (int i = 0; i <= n ; i++) {
			if (i%2 == 0){
				System.out.println(i + " jest parzystą liczbą");
			} else {
				System.out.println(i + " jest nieparzystą liczbą");
			}
		}

		int i = 0;
		while (i <= n){
			if (i%2 == 0){
				System.out.println(i + " jest parzystą liczbą");
			} else {
				System.out.println(i + " jest nieparzystą liczbą");
			}
			i++;
		}

	}

}
