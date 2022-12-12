import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = input.nextInt();
        int newi = n;
        while (newi>0){
            for (int a = 1;a<=n-newi;a++){
                System.out.print(" ");
            }
            for (int b = 1;b<=(2*newi)-1;b++){
                System.out.print("*");
            }
            newi--;
            System.out.println();
        }
    }
}