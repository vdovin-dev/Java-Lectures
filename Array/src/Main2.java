
import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        //Выводим 3 последних числа
        int [] mass = new int[n];
        for (int i = 0;i<n;++i){
            mass[i] = in.nextInt();
        }

        for (int i = n - 3; i < n; ++i){
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
}
