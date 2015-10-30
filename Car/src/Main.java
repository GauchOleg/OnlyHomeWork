/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        SmallLorries lorries = new SmallLorries();

        String a = SmallLorries.toGo;
        int b = SmallLorries.weight;
        boolean c = SmallLorries.insertOptions;
        String d = SmallLorries.lowSpeed;
        int e = SmallLorries.deleveryProduct;

        lorries.setNameCar("Car ");
        lorries.setPeoplePlays(2);



        System.out.println("Этот класс использует данные интерфейсов: " + "Auto " + "и" + " lorries" + " вот эти параметры: " + "\r\n"
                + a + " " + b + "" + c + " " + d + " "+ e + " " + "\n\r" + "Так же имеет свои параметры: " + "\r\n" + lorries.getNameCar()
                + lorries.getPeoplePlays());


        System.out.println("");
        System.out.println("");
        System.out.println("");


        SportCarNextLevel carNextLevel = new SportCarNextLevel();
        String a2 = SportCar.toGo;
        int b2 = SportCar.weight;
        boolean c2 = SportCar.insertOptions;
        String d2 = SportCar.hightSpeed;
        String e2 = SportCar.clirins;

        carNextLevel.setNameCar("Car2 ");
        carNextLevel.setMaxSpeed(400);

        System.out.println("Этот класс использует данные интерфейсов: " + "Auto " + "SporCar" + " вот эти параметры: " + "\r\n" +
                a2 + " " + b2 + " " + c2 + " " + d2 + " " + e2 + " " + "\r\n" + "Так же имеет свои параметры: " + "\r\n" +
                carNextLevel.getNameCar() + carNextLevel.getMaxSpeed());


        System.out.println("");
        System.out.println("");
        System.out.println("");


        UsualCarNextLevel usual = new UsualCarNextLevel();
        String a3 = UsualCar.toGo;
        int b3 = UsualCar.weight;
        boolean c3 = UsualCar.insertOptions;
        String d3 = UsualCar.normalSpeed;
        int e3 = UsualCar.sizeCapacity;

        usual.setNameCars("Car3");
        usual.setEnginePower(500);

        System.out.println("Этот класс использует данные интерфейсов: " + "Auto " + "UsualCar" + " вот эти параметры: " + "\r\n"+
                a3 + " " + b3 + " " + c3 + " " + d3 + " " + e3 + " " + "\r\n" + "Так же имеет свои параметры: " +
                "\r\n" + usual.getNameCars() + " " + usual.getEnginePower());



    }
}