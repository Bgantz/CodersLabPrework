
public class Main2 {

	public static void main(String[] args) {
		int nr1 = 3;
		int nr2 = 2;
		int nr3 = 3;

		if (nr1 > nr2 && nr1 > nr3) {
			System.out.println(nr1 + " jest większe od " +  nr2 + " oraz " + nr3);
		} else if (nr2 > nr1 && nr2 > nr3) {
			System.out.println(nr2 + " jest większe od " +  nr1 + " oraz " + nr3);
		} else {
			System.out.println(nr3 + " jest większe bądź równe " +  nr1 + " bądź " + nr2);
		}


	}

}
