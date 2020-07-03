import java.util.Scanner;

public class FinalExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует КВ-3000");
        System.out.println("Введите текущий курс доллара:");
        float x = scanner.nextFloat();
        System.out.println("Введите сумму в рублях:");
        int y = scanner.nextInt();
        float dollar =  y / x;
        System.out.println("Сумма в долларах:");
        System.out.printf("%.2f", dollar);
    }
}

