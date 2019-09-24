
public class Main2 {

	public static void main(String[] args) {
		String[] fruits = new String[]{"jabłko", "gruszka","pomarańcza","limonka"};
		System.out.println("Pierwszy owoc to: " + fruits[0]);
		System.out.println("Ostatni owoc to: " + fruits[fruits.length - 1]);

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
