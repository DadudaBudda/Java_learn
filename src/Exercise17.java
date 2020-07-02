import java.io.*;


public class Exercise17 {
    public static void main(String[] args) {
        String First;
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));


        try (FileWriter wrtr = new FileWriter("test.txt")) {
            do {
                System.out.println("Введите текст для записи в файл или слово 'stop' для остановки программы:  ");
                First = rdr.readLine();

                if (First.compareTo("stop") == 0) break;
                First = First + "\r\n";
                wrtr.write(First);
            }
            while (First.compareTo("stop") != 0);
        }
        catch(IOException exception){
            System.out.println("Ошибка ввода-вывода: " + exception);
        }
    }
}