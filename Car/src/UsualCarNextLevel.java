/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class UsualCarNextLevel implements UsualCar {

    private int enginePower;
    private String NameCars;

    public int getEnginePower() {
        return enginePower;
    }

    public UsualCarNextLevel setEnginePower(int enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    public String getNameCars() {
        return NameCars;
    }

    public UsualCarNextLevel setNameCars(String NameCars) {
        this.NameCars = NameCars;
        return this;
    }
}