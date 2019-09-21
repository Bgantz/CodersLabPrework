/*
W pliku `Main11.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat (tutaj dla ```n = 5```):

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5
```

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu
zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.

 */

public class Main11 {

    public static void main(String[] args) {
        int n = 5;
        String line = "";
        int limit = 2 * n;
        for (int i = 0; i <= n ; i++) { // row loop
            for (int j = 0; j <= n; j++) { //column loop
                if (j<=i){
                    System.out.print("* ");;
                } else if (j < n) { // first half of the row condition
                    System.out.print(j+1 + " "); // couter and space print
                }else if (j == n){ // end of the line condition
                    System.out.print(" " + i); //TODO:delete after finish
                    System.out.print("\n");
                }
            }
        }
        for (int i = n; i <= limit ; i++) {
            for (int j = 0; j <= n; j++) {
                if (i < limit){
                    System.out.print("* ");
                } else if (i < n ){
                    System.out.print(j + " ");
                } else if ( j == n){
                    System.out.print(" " + i); //TODO:delete after finish
                    System.out.print("\n");
                }
            }
        }

    }

}
