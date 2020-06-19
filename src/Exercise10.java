import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во строк матрицы: ");
        int arrayStrings = scanner.nextInt();
        System.out.print("Введите кол-во столбцов матрицы: ");
        int arrayColumn = scanner.nextInt();
        int[][] matrix = new int[arrayStrings][arrayColumn];
        for (int x = 0; x < arrayStrings; ++x) {
            for (int i = 0; i < arrayColumn; ++i) {
                System.out.print("Введите элемент матрицы: ");
                matrix[x][i] = scanner.nextInt();
            }
        }
        System.out.println("\n" +"\n" + "Вывод первой строки матрицы:" + "\n");
        for(Integer i : matrix[0]) {
            System.out.print("\t" + i * 3);
        }

//        System.out.println("\n" +"\n" + "Матрица:" + "\n");
//
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print("\t" + anInt);
//            }
//            System.out.println();
//        }
    }
}
