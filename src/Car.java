import java.util.ArrayList;

public class Car {
    float speed = 0;
    int maxSpeed;
    String regNumber = "";
    String[] passangers = new String[4];
    ArrayList<String> trunk = new ArrayList<>();

    public Car(String regNumber, int maxSpeed) {
        maxSpeed = maxSpeed;
        regNumber = regNumber;
    }

    public void speedUp(int change) {


            if (speed + change < maxSpeed){
                speed += change;
        }
    else
        {
            System.out.println("ajdinaid");
        }
    }
}
