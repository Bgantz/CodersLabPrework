public class Main8 {

	public static void main(String[] args) {
		int black = 16;
		int white = 15;
		boolean blackOrWhite = black < white;
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = good || bad;
		boolean comparison = blackOrWhite && goodOrBad;
		System.out.println(blackOrWhite);
		System.out.println(goodOrBad);
		System.out.println(comparison);

	}

}
