import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int massive[] = new int[new Scanner(System.in).nextInt()];

        for (int x = 0; x < massive.length; x++) {
            System.out.print("Введите элемент массива: ");
            massive[x] = new Scanner(System.in).nextInt();
        }

        for (Integer i : massive) {
            System.out.print("\t" + i * 2);
        }

    }

}