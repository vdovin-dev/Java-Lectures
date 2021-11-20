import java.util.Scanner;

//Задача 3

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи M: ");
        int m = in.nextInt();

        System.out.print("Введи N: ");
        int n = in.nextInt();

        int[][] mass = new int[m][n];

        int max = Integer.MIN_VALUE;

        int maxi = -1;
        int maxj = -1;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mass[i][j] = in.nextInt();

            }
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mass[i][j] > max) {
                    max = mass[i][j];
                    maxi = i;
                    maxj = j;

                }
            }
        }
        System.out.print("i: " + maxi);
        System.out.print("j: " + maxj);
        System.out.print("Max elem: "+ max);
    }
}
