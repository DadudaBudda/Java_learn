import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        /* Ввести с консоли число в бинарном формате.
        Перевести его в десятичный формат, записать в переменную int и вывести на экран.
        */
        System.out.print("Введите число в бинарном формате: ");
        Scanner scan = new Scanner(System.in);
        int bin = scan.nextInt();
        int binNum = Integer.parseInt(String.valueOf(bin), 2);
        System.out.println ("Вы ввели число " + binNum);
    }

}
