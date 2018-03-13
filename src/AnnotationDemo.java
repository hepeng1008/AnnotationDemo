public class AnnotationDemo {


    @Mytag(name="audi",size=10)
    private Car car;

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        this.car=car;
    }

    @Override
    public String toString() {
        return "AnnotationDemo{" +
                "car=" + car +
                '}';
    }
}

