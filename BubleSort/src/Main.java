import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N:");
        int n = in.nextInt();
        // Эл массива вводим
        int [] mass = new int[n];
        for (int i = 0; i<n; ++i){
            mass[i] = in.nextInt();

        }
        //Сортировка
        for (int i = 0; i<mass.length - 1 ;++i){
            for (int j = 0; j<mass.length-i-1;++j){
                if(mass[j] < mass[j+1]){

                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j+1] = temp;

                }
            }
        }
        //Меняем местами макс и мин значение
        int temp =mass[mass.length-1];
        mass[mass.length-1] = mass[0];
        mass[0] = temp;

        for (int i = 0; i<mass.length; ++i){
            System.out.print(mass[i] + " ");
        }
    }
}

