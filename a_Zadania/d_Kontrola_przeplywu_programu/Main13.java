
public class Main13 {

    public static void main(String[] args) {
        int points = 10;

        if (points <= 0){
            System.out.println("Liczba punktór mniejsza niż 0.");
        } else if (points >= 100){
            System.out.println("Liczba punktów większa niz 100.");
        } else {
            if (points <= 39){
                System.out.println("Ocena: niedostataczna");
            } else if ( 40 <= points && points <= 54){
                System.out.println("Ocena: dopuszczająca");
            } else if ( 55 <= points && points <= 69){
                System.out.println("Ocena: dobra");
            } else if ( 70 <= points && points <= 84){
                System.out.println("Ocena: bardzo dobra");
            } else if ( 85 <= points && points <= 98){
                System.out.println("Ocena: bardzo dobra");
            } else if ( 99 == points){
                System.out.println("Ocena: celująca");
            }
        }
    }

}
