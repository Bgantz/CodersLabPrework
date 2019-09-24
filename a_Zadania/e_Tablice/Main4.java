
public class Main4 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,23,4};
		int sumOdd = 0;

		for (int number: numbers){
			if (number%2 == 0){
				System.out.println(number);
			} else {
				sumOdd += number;
			}
		}
		System.out.println("Suma liczb nieparzystych to: " + sumOdd);
	}

}
