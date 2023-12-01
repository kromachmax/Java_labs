public class Main {
    public static void main(String[] args) {
        int num = 2;
        String str = "Hello";
        char ch = 'A';
        boolean bool = true;
        double dbl = 3.14;

        System.out.println("Switch statement can be used with different types:");

        switch (num) {
            case 1:
                System.out.println("num is 1");
                break;
            case 2:
                System.out.println("num is 2");
                break;
            default:
                System.out.println("num is not 1 or 2");
                break;
        }

        switch (str) {
            case "Hello":
                System.out.println("str is Hello");
                break;
            case "World":
                System.out.println("str is World");
                break;
            default:
                System.out.println("str is neither Hello nor World");
                break;
        }

        switch (ch) {
            case 'A':
                System.out.println("ch is A");
                break;
            case 'B':
                System.out.println("ch is B");
                break;
            default:
                System.out.println("ch is not A or B");
                break;
        }

        if (bool) {
            System.out.println("bool is true");
        } else {
            System.out.println("bool is false");
        }

        switch ((int) dbl) {
            case 3:
                System.out.println("dbl is 3");
                break;
            case 4:
                System.out.println("dbl is 4");
                break;
            default:
                System.out.println("dbl is neither 3 nor 4");
                break;
        }
    }
}