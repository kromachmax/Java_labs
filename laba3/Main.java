public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Логические операции &&, ||, !
        boolean result1 = (x < y) && (x != 0);
        boolean result2 = (x > y) || (y < 0);
        boolean result3 = !(x == y);

        System.out.println("Результаты логических операций:");
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        // Тернарная операция x < y ? x : y
        int min = (x < y) ? x : y;
        System.out.println("Минимальное значение: " + min);

        // Поразрядные логические операции &, |, ^, ~
        int bitwiseAnd = x & y;
        int bitwiseOr = x | y;
        int bitwiseXor = x ^ y;
        int bitwiseComplement = ~x;

        System.out.println("Результаты поразрядных логических операций:");
        System.out.println("bitwiseAnd: " + bitwiseAnd);
        System.out.println("bitwiseOr: " + bitwiseOr);
        System.out.println("bitwiseXor: " + bitwiseXor);
        System.out.println("bitwiseComplement: " + bitwiseComplement);

        // Операции сдвига >>, <<, >>>
        int shiftRight = x >> 1;
        int shiftLeft = y << 2;
        int logicalShiftRight = x >>> 1;

        System.out.println("Результаты операций сдвига:");
        System.out.println("shiftRight: " + shiftRight);
        System.out.println("shiftLeft: " + shiftLeft);
        System.out.println("logicalShiftRight: " + logicalShiftRight);
    }
}