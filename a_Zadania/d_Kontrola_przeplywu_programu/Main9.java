
public class Main9 {

    public static void main(String[] args) {
        int n = 25;
            for (int j = 1; j <= n ; j++) {

                String line = "";

                for (int i = 1; i <= n ; i++) {
                    if (i <= j){
                        line += "* ";
                    } else {
                        line += i + " ";
                    }
                }

                line += "\n";
                System.out.print(line);

            }
    }

}
