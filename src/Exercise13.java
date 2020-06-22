import java.util.Scanner;





public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String textOne = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String textTwo = scanner.nextLine();
        int textOneLength = textOne.length();
        int textTwoLength = textTwo.length();
        if (textOneLength > textTwoLength)
            System.out.print("Первая строка по количеству символов длиннее: " + textOne);
        else if (textOneLength < textTwoLength)
            System.out.print("Вторая строка по количеству символов длиннее: " + textTwo);
        else
            System.out.print("Строки по количеству символов равны");
    }
}
