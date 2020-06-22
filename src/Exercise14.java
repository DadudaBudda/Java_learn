import java.util.Scanner;



public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = scanner.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}