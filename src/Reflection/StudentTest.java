package Reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Class stClass = Student.class;
        System.out.println("Class Name:" + "\t" + stClass.getName());

        Constructor[] constructors = stClass.getConstructors();
        System.out.println("Constructors are:");
        int i = 0, j = 0;
        for(Constructor c: constructors ) {
            System.out.println("Constructor("+ (++i) + "): " + c.getName());
            System.out.println("Parameters are: ");
            if(c.getParameterCount() == 0)
                System.out.println("No arguments");
            else {
                Parameter[] parameters = c.getParameters();
                for(Parameter p: parameters)
                    System.out.println("Parameter(" + (++j) + "): " + p.getName() + " : Parameter Type: " + p.getType());
            }
        }
        Method[] methods = stClass.getDeclaredMethods();
        System.out.println("Methods are:");
        i = 0;
        for(Method m: methods )

            System.out.println("Method(" + (++i) + "): " + Modifier.toString(m.getModifiers()) + " " + m.getReturnType() + " " + m.getName() + " " + Arrays.toString(m.getParameters()));

        Field[] fields = stClass.getDeclaredFields();
        System.out.println("Fields are:");
        i = 0;
        for(Field f: fields )

            System.out.println("Field(" + (++i) + "): " + Modifier.toString(f.getModifiers()) + " " + f.getType().getName() + " " + f.getName());

    }
}