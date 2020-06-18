import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        int[][] matrix = new int[new Scanner(System.in).nextInt()][new Scanner(System.in).nextInt()];
        for (int x = 0; x < matrix.length; ++x) {
            for (int i = 0; i < matrix.length; ++i) {
                System.out.print("Введите элемент матрицы: ");
                matrix[x][i] = new Scanner(System.in).nextInt();
            }
        }
        for(Integer i : matrix[0]) {
            System.out.println(i * 3);
        }
    }
}
