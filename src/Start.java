import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        var exercise = scanner.nextInt();
        switch (exercise) {
            case 4 -> Exercise4.main(args);
            case 5 -> Exercise5.main(args);
            case 6 -> Exercise6.main(args);
            case 7 -> Exercise7.main(args);
            case 8 -> Exercise8.main(args);
            case 9 -> Exercise9.main(args);
            case 10 -> Exercise10.main(args);
            case 11 -> Exercise11.main(args);
            case 12 -> Exercise12.main(args);
            case 13 -> Exercise13.main(args);
            case 14 -> Exercise14.main(args);
            default -> System.out.print("Такого задания нет");
        }
    }
}
