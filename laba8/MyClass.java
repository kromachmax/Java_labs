public class MyClass {
    private int value;
    private String str;
    public MyClass(int val, String s){
        this.value = val;
        this.str = s;
    }
    public void PrintData(){
        System.out.println("Name: " + str + " , value: " + value);
    }
}
