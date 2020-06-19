import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        int[][] matrix = new int[new Scanner(System.in).nextInt()][new Scanner(System.in).nextInt()];
        for (int x = 0; x < matrix.length; ++x) {
            for (int i = 0; i < matrix[x].length; ++i) {
                System.out.print("Введите элемент матрицы: ");
                matrix[x][i] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Вывод первой строки матрицы:");
        for(Integer i : matrix[0]) {
            System.out.print("\t" + i * 3);
        }
        System.out.println();
        System.out.println("Матрица:");

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print("\t" + anInt);
            }
            System.out.println();
        }
    }
}
