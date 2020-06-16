import java.util.Scanner;

public class Multiplplicationtable {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i=1;i<=10;i++){
            System.out.print("\t" + i*number);
        }
    }
}
