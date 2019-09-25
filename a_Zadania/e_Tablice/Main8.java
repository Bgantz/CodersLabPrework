/*
W pliku `Main8.java` znajduje się tablica z temperaturami.

1. Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamień ją na stopnie Fahrenheit'a.
   Przelicznik jest następujący: `tempCelc * 1.8 + 32`.
2. Aby to zrobić przeiteruj tablicę i nadpisz daną temperaturę nową, obliczoną wartością.
3. Oblicz średnią temperaturę z nowo wyliczonych wartości i przypisz do zmiennej `avg`.
4. Wypisz ją w konsoli wg wzoru: `Średnia temperatura to: 3.95` – zaokrąglij liczbę do dwóch miejsc po przecinku.
Możesz użyć użyj funkcji:
 ```java
 String.format( "%.2f", variableToFormat );
 ```

 */
public class Main8 {

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, -15};
		double[] tempFahr = {temps.length};
		double avg;

		for (double tempCelc: temps) {
			tempFahr.add(tempCelc * 1.8 + 32);
		}

		int sum = 0;
		for (double value : tempFahr) {
			sum += value;
		}
		avg = sum / tempFahr.length;

		String.format("%2f", avg);
		System.out.println("Średnia temperatura to: " + avg);

	}

}
