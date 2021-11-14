import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи N: ");
        int n = in.nextInt();

        int[] mass = new int[n];
        System.out.print("Введите эл.массива: ");

        for (int i = 0; i < mass.length; ++i) {
            mass[i] = in.nextInt();
        }
        System.out.println("Четные элементы массива: ");
        for (int q = 0; q < mass.length; ++q) {
            if (mass[q] % 2 == 0) {
                System.out.print(mass[q] + " ");
            }
        }
        System.out.println();
        System.out.print("Неч. элементы: ");
        for (int k = n - 1; k >= 0; --k) {
            if (mass[k] % 2 != 0) {
                System.out.print(mass[k] + " " +k);
            }
        }
    }
}