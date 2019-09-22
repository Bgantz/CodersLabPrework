/* 1. W pliku `Main12.java` napisz program definiujący trzy liczby w zmiennych: `a, b, c`.
2. Program ma sprawdzić, czy podane liczby mogą być bokami trójkąta.
3. Tę figurę geometryczną można zbudować z trzech linii tylko wtedy, gdy suma długości dwóch z nich jest większa niż długość trzeciej linii, czyli:

```
a + b > c
c + b > a
a + c > b
```

Po sprawdzeniu wypisz na konsoli odpowiednią informację, wg poniższego wzoru:

`Z podanych boków można zbudować trójkąt.`

lub

`Z podanych boków nie można zbudować trójkąta.`

 */
public class Main12 {

    public static void main(String[] args) {
        int a,b,c;
        a = 2;
        b = 2;
        c = 10;

        // warunki zaprezentowane powyżej są dziwne i wedle nich można stworzyć trójkąt o bokach 2-2-10

        if (a + b > c ){
            System.out.println("Z podanych boków można zbudować trójkąt.");
        }else if(c + b > a) {
            System.out.println("Z podanych boków można zbudować trójkąt.");
        } else if( a + c > b){
            System.out.println("Z podanych boków można zbudować trójkąt.");
        } else {
            System.out.println("Z podanych boków nie można zbudować trójkąt");
        }

    }

}
