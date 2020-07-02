import java.util.Scanner;




public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        System.out.println("Введите данные в массив:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i]= scanner.nextInt();
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Ваш массив отсортирован по возрастанию:");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
}