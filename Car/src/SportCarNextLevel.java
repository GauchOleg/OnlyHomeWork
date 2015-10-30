/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class SportCarNextLevel implements SportCar{
    private int maxSpeed;
    private String nameCar;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public SportCarNextLevel setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public String getNameCar() {
        return nameCar;
    }

    public SportCarNextLevel setNameCar(String nameCar) {
        this.nameCar = nameCar;
        return this;
    }
}