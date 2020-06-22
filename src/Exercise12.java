import java.util.Scanner;



public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Текст без пробелов: " + text.replaceAll(" ", ""));
    }
}