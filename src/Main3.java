import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи M: ");
        int m = in.nextInt();

        System.out.print("Введи N: ");
        int n = in.nextInt();

        int [] [] mass = new int[m] [n];

        for (int i =0; i<m; ++i){
            for (int j =0; j<n; ++j){
                mass[m] [n] = in.nextInt();

            }
        }
        for (int i = 0; i<m; ++i){
            for(int j = 0; j<n; ++i){
                if (mass[i][j] >mass[i] [j]){
                    System.out.print("Max elem: ");
                }
            }
        }
    }
}
