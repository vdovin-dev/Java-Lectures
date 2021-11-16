import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи M: ");
        int m = in.nextInt();

        System.out.print("Введи N: ");
        int n = in.nextInt();

        System.out.print("Введи K: ");
        int k = in.nextInt();


        int [] [] mass = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mass[i][j] = in.nextInt();

            }
        }
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; ++i){
            sum = sum + mass[k -1] [i];
            //sum2 = sum2 * mass[k -1] [i];
        }
        System.out.print("Сумма: " + sum);
        System.out.print("Произв: " + sum2);

    }

}
