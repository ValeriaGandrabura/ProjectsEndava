package DrawingStaircase2;

public class DrawingStaircase {

    public static void main(String[] args) {
        int n = 10;
        String[][] staircase = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j || i == j) {
                    staircase[i][j] = "#";
                    System.out.print(staircase[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
