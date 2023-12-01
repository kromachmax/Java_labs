public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Метод length() возвращает длину строки
        int length = str.length();
        System.out.println("Длина строки: " + length);

        // Метод charAt() возвращает символ по указанному индексу
        char firstChar = str.charAt(0);
        System.out.println("Первый символ: " + firstChar);

        // Метод substring() возвращает подстроку начиная с указанного индекса
        String substring = str.substring(7);
        System.out.println("Подстрока: " + substring);

        // Метод indexOf() возвращает индекс первого вхождения указанной строки или символа.
        int index = str.indexOf(",");
        System.out.println("Индекс запятой: " + index);

        // Метод contains() проверяет, содержит ли строка указанную подстроку
        boolean contains = str.contains("World");
        System.out.println("Содержит 'World'? " + contains);

        // Метод replace() заменяет все вхождения указанной подстроки на новую строку
        String replaced = str.replace("Hello", "Привет");
        System.out.println("Замененная строка: " + replaced);

        // Метод toLowerCase() преобразует все символы строки в нижний регистр
        String lowerCase = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCase);

        // Метод toUpperCase() преобразует все символы строки в верхний регистр
        String upperCase = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCase);
    }
}

