package algoritmHM6;

public class Dinamic {
    public static void main(String[] args) {
        int m = 4; // Количество строк
        int n = 4; // Количество столбцов

        int result = dinamic(m, n);
        System.out.println(result);


    }
    public static int dinamic (int n, int m) {
        int [][] frosch = new int [n][m];

        for (int i = 0; i <m; i++) {
            frosch[i][0] = 1;
        }

        for (int j = 0; j <n ; j++) {
            frosch[j][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                frosch[i][j] = frosch[i - 1][j] + frosch[i][j - 1];
            }
        }
         return frosch [m - 1][n - 1];
    }


}
