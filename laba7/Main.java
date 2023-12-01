public class Main {
    public static void main(String[] args) {
        MyClass<Integer> a = new MyClass<Integer>(1);
        MyClass<Integer> b = new MyClass<Integer>(2); 
        System.out.println("Значения до свапа:\nа = " + a.getValue() + "\nb = " + b.getValue());
        a.swapValues(b);
        System.out.println("Значения после свапа:\nа = " + a.getValue() + "\nb = " + b.getValue());
    }
}