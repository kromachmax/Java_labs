public class Main {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        // Перебор всех аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}