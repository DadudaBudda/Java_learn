import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int X = 10;
        final int Y = 20;
        final int Z = 30;
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number == X || number == Y || number == Z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }

}