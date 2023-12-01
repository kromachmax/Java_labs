
public class Main{

    public static void main(String[] args) {

       MyStack<Integer> intStack = new MyStack<>(5);

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Размер стека интов: " + intStack.getSize());

        System.out.println("Верхний элемент в стеке интов: " + intStack.peek());

        intStack.pop();

        System.out.println("Стек интов пуст: " + intStack.isEmpty());

        MyStack<String> stringStack = new MyStack<>(3);

        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        System.out.println("Верхний элемент в стеке строк: " + stringStack.peek());

        stringStack.pop();

        System.out.println("Размер стека строк: " + stringStack.getSize());

        System.out.println("Стек интов полон: " + stringStack.isFull());
    }
}