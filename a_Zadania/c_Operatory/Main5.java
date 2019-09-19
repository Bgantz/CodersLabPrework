
public class Main5 {

	public static void main(String[] args) {

		int a = 1; //deklaracja zmiennej a
		int b; //deklaracja zmiennej b jako pustej
		System.out.println(++a); // zmienna a zostanie rozszerzona i wypisana
		System.out.println(a++); // zmienna a zostanie wypisana i rozszerzona
		System.out.println(a); // zmienna a zostanie wypisana
		b=a++; //zmienna b zostaje zadeklarowana jako wartość zmiennej a
		System.out.println(b); // zmienna b zostaje wypisana
		b=++a; //zmienna b zostanie powiększona o wartość zmiennej a
		System.out.println(++a); //zmienna a zostanie wypisana
	}

}
