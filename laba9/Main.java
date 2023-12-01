import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Имя класса и метода
            String className = "MyClass";
            String methodName = "PrintData";

            Class<?> clazz = Class.forName(className);

            Object instance = clazz.newInstance();

            Method method = clazz.getMethod(methodName);

            method.invoke(instance);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}