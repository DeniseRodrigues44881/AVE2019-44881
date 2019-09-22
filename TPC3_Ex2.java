
import other.C;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class App {
    public static void Main(String[]args){
        PrintBaseTypes("Ola");
        PrintBaseTypes(19);
        PrintBaseTypes(new C());

        PrintMembers(new C());
        PrintMethods(new C());
        PrintFields(new C());

    }

    public static void PrintMembers(Object obj) {
        System.out.println("Members: ");
        PrintMethods(obj);
        PrintFields(obj);

    }
    public static void PrintMethods(Object obj) {
        Method[] methods=obj.getClass().getMethods();
        System.out.print("Methods: ");
        for(Method m : methods) System.out.println(m.getName() + " ");

    }
    public static void PrintFields(Object obj) {
        Field[] fields=obj.getClass().getFields();
        System.out.println("Fields: ");
        for(Field f : fields) System.out.println(f.getName() + " ");
    }

    public static void PrintBaseTypes(Object obj)
    {
        Class t = obj.getClass();
        do {
            System.out.print(t.getName() + " ");
            PrintInterfaces(t);
            t = t.getClass();
            // } while( t != typeOfObject);
        } while( t != null);
        System.out.println();
    }

    private static void PrintInterfaces(Class t) {
    }
}
}