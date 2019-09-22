
public class Main11 {

    public static void main(String[] args) {
        int n = 5;
        String line = "";
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j < i) {
                    line += "* ";
                } else if (j < n) {
                    line += j + 1 + " ";
                } else if (j == n) {
                    line += "\n";
                    break;
                }
            }
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n; j++) {
                if (j < i) {
                    line += "* ";
                } else if (j < n) {
                    line += j + 1 + " ";
                } else if (j == n) {
                    line += "\n";
                    break;
                }
            }

        }
        System.out.print(line);
        // TODO: second starred line

    }
}