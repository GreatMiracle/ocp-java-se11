package CreatingAnnotations;

import annotations.MyClassAnnotation;
import annotations.MyRuntimeAnnotation;
import annotations.MySourceAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyClassAnnotation()
@MySourceAnnotation()
@MyRuntimeAnnotation()
public class TestingAnnotatedClasses {

    // reflection methods used to get information about class, methods,
    // fields
    public void printRuntimeAnnotations() {
        Class c = this.getClass();

        showAnnotations(c);
        for (Method method : c.getDeclaredMethods()) {
            showAnnotations(method);
        }
        for (Field field : c.getDeclaredFields()) {
            showAnnotations(field);
        }

    }

    // Gets declared annotations, not inherited ones
    public void showAnnotations(Object e) {
        Annotation[] annotations = null;
        if (e instanceof Class) annotations =
                ((Class) e).getDeclaredAnnotations();
        else if (e instanceof Method) annotations =
                ((Method) e).getDeclaredAnnotations();
        else if (e instanceof Field) annotations =
                ((Field) e).getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(e.getClass().getSimpleName() +
                    " Annotation: " + annotation);
        }
    }

    public static void main(String[] args) {
        new TestingAnnotatedClasses().printRuntimeAnnotations();

    }
}