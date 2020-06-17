import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int arithmeticMean = (x + y + z) / 3;
        System.out.println("Cреднее арифметическое = " + arithmeticMean);
        if (arithmeticMean / 2 > 3)
            System.out.println("Программа выполнена корректно");
        else
            System.out.println("Программа выполнена не корректно");
    }
}

