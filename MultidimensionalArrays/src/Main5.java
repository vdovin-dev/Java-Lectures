import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи N: ");
        int n = in.nextInt();

        int [] mass = new int[n];

        for (int i=0; i<mass.length; i++) {
            mass[i] = in.nextInt();
            System.out.print(mass[i]);
        }
        System.out.println();

        int temp;

        for (int i = 0; i < n/2; i++) {
            temp = mass[n-i-1];
            mass[n-i-1] = mass[i];
            mass[i] = temp;
        }
        for (int i=0; i<mass.length; i++){
            System.out.print(mass[i]);
        }

    }
}
