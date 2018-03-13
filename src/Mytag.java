import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Mytag {
    String name() default "车";
    int size() default 10;
}
