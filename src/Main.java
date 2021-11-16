import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.print("Введите кол-во строк:");
        int a = in.nextInt();

        System.out.print("Введите кол-во колонок:");
        int b=in.nextInt();




        int[] [] mass = new int[a][b];

        for(int i = 0; i< mass.length;++i){
            for(int j =0; j<mass[i].length;++j){
                mass[i][j]= (int) (Math.random() * 10)+ 1;
            }
        }

        for (int i = 0; i<mass.length;++i){
            for (int j = 0; j<mass[i].length; ++j){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }


    }
}
