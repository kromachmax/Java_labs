import java.util.Arrays;
public class MyStack<T> {
    private int top = -1;
    private T[] stackArray;

    public MyStack(int size) {
        stackArray = (T[]) new Object[size];
    }
    public MyStack () {
        this(16);
    }
    public void push(T value) {
        if (top + 1 == stackArray.length ) {
            stackArray = Arrays.copyOf(stackArray, 2*stackArray.length);
        }
        stackArray[++top] = value;

    }

    public T pop() {
        if (top >= 0) {
            T poppedValue = (T) stackArray[top];
            stackArray[top] = null;
            --top;
            return poppedValue;
        } else {
            System.out.println("Стек пуст. Невозможно извлечь элемент.");
            return null;
        }
    }

    public T peek() {
        if (top >= 0) {
            T peekedValue = (T) stackArray[top];
            return peekedValue;
        } else {
            System.out.println("Стек пуст. Нет значения на вершине.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public int getSize(){
        return stackArray.length;
    }
}
