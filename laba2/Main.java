import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (разделенные пробелами):");

        // Проверяем, есть ли следующее слово
        while (scanner.hasNext()) {
            // Считываем следующее слово
            String word = scanner.next();

            // Выводим считанное слово
            System.out.println("Слово: " + word);
        }

        scanner.close();
    }
}