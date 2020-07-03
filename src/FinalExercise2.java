import java.util.Scanner;

public class FinalExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        System.out.println("Введите данные в массив:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println("Ваш массив отсортирован по возрастанию:");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}

