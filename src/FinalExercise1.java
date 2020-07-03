import java.util.Scanner;




public class FinalExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String bin = scanner.nextLine();
        int binInt = Integer.parseInt(bin);
        int dec = 0, p = 0;
        while (binInt != 0){
            dec +=((binInt % 10) * Math.pow(2, p));
            binInt = binInt / 10;
            p++;
        }
        System.out.println(dec);
    }
}