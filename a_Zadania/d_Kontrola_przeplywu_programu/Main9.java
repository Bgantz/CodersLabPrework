
public class Main9 {

    public static void main(String[] args) {
        int n = 25;
            for (int j = 1; j <= n ; j++) {

                String line = "";

                for (int k = 1; k < j ; k++) {
                    line += "* ";
                }
                for (int k = j; k <= n; k++) {
                    line += k + " ";
                }

                line += "\n";
                System.out.print(line);

            }
    }

}
