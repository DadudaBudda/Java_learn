import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var exercise = 1;
        while (exercise > 0){

            System.out.print("\n Введите номер задачи или 0 для выхода: ");
            exercise = scanner.nextInt();
            String msg = "Задача №" + exercise + "\n";
            switch (exercise) {
                case 2 -> {
                    System.out.print(msg);
                    HelloWorld.main(args);
                }
                case 3 -> {
                    System.out.print(msg);
                    Multiplplicationtable.main(args);
                }
                case 4 -> {
                    System.out.print(msg);
                    Exercise4.main(args);
                }
                case 5 -> {
                    System.out.print(msg);
                    Exercise5.main(args);
                }
                case 6 -> {
                    System.out.print(msg);
                    Exercise6.main(args);
                }
                case 7 -> {
                    System.out.print(msg);
                    Exercise7.main(args);
                }
                case 8 -> {
                    System.out.print(msg);
                    Exercise8.main(args);
                }
                case 9 -> {
                    System.out.print(msg);
                    Exercise9.main(args);
                }
                case 10 -> {
                    System.out.print(msg);
                    Exercise10.main(args);
                }
                case 11 -> {
                    System.out.print(msg);
                    Exercise11.main(args);
                }
                case 12 -> {
                    System.out.print(msg);
                    Exercise12.main(args);
                }
                case 13 -> {
                    System.out.print(msg);
                    Exercise13.main(args);
                }
                case 14 -> {
                    System.out.print(msg);
                    Exercise14.main(args);
                }
                default -> System.out.print("Такого задания нет");
            }
        }
    }
}

