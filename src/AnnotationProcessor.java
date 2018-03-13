import java.lang.reflect.Field;

public class AnnotationProcessor {

    public static void annoProcess(AnnotationDemo annotation){
        for(Field field:annotation.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Mytag.class)){
                Mytag mytag=field.getAnnotation(Mytag.class);
                annotation.setCar(new Car(mytag.name(),mytag.size()));
            }
        }
    }

    public static void main(String[] args) {
        AnnotationDemo ann = new AnnotationDemo();
        annoProcess(ann);
        System.out.println(ann.getCar());
    }
}
