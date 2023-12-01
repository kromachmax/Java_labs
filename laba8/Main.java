import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;

        System.out.println("Class Name: " + clazz.getName());

        System.out.println("Fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("  " + field.getName() + " : " + field.getType());
        }

        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print("  " + method.getName() + "(");

            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getType().getName() + " " + parameters[i].getName());
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println(") : " + method.getReturnType().getName());
        }
    }
}