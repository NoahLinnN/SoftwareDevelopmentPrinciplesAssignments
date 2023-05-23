public class Main {
    public static void main(String[] args) {
        Car car = new Car("555-AB-1",40,1/20d);

        car.drive(20);
        System.out.println(car);
    }
}