import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Mytag {
    //@target注解，表示该创建的注解可以用在哪些地方，本例子中声明的为ElementType.METHOD,ElementType.FIELD，即表示该
    //Mytag标签可以用在方法和类的属性上面，用在其他地方则非法。
    String name() default "车";
    int size() default 10;
}
