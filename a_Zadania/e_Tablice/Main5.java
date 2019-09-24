
public class Main5 {

	public static void main(String[] args) {
		int[] numbers = {129,2,3,-4,5,6,34,67,54,32};
		int max = 0;

		for(int number : numbers){
			if ( max < number){
				max = number;
			}
		}
		System.out.println(max);
	}

}
