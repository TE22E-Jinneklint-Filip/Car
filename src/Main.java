public class Main {
    public static void main(String[] args) {
        System.out.println("My car!");

        Car car1 = new Car("ABC123", 200);
        Car car2 = new Car("WOW420", 400);

        System.out.println("Car 1 has regnumber: " + car1.regNumber + "and max speed: " + car1.maxSpeed);

    }
}