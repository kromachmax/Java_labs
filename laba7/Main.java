public class Main {
    public static void main(String[] args) {
        Film book_1 = new Film("Fight Club", 1999, "David Fincher", "Thriller");
        Film book_2 = new Film("American Psycho", 2000, "Marry Harron", "Horror");

        book_1.print();
        book_2.print();

        MyClass<Film> Wfilm_1 = new MyClass<>(book_1);
        MyClass<Film> Wfilm_2 = new MyClass<>(book_2);

        Wfilm_1.swapValues(Wfilm_2);
        book_1 = Wfilm_1.getValue();
        book_2 = Wfilm_2.getValue();

        book_1.print();
        book_2.print();

    }
}
