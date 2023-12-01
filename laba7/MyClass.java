public class MyClass<T> {
    private T value;
    public MyClass(T new_value){
        value = new_value;
    }

    public T getValue() {
        return value;
    }
    public void swapValues(MyClass<T> other){
        T tmp = this.value;
        this.value = other.value;
        other.value = tmp;
    }
}
