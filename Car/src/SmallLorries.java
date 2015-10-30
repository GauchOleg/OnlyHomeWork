/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class SmallLorries implements lorries {
    private int peoplePlays;
    private String nameCar;

    public int getPeoplePlays() {
        return peoplePlays;
    }

    public SmallLorries setPeoplePlays(int peoplePlays) {
        this.peoplePlays = peoplePlays;
        return this;
    }

    public String getNameCar() {
        return nameCar;
    }

    public SmallLorries setNameCar(String nameCar) {
        this.nameCar = nameCar;
        return this;
    }
}