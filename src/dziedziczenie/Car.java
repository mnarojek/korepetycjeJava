package dziedziczenie;

public class Car extends Vehicles{
    public Car(Engine silnik, double makspredkosc, double pojemnoscZbiornika){
        super(silnik,makspredkosc,pojemnoscZbiornika);
    }


    @Override
    public String toString() {
        return "Samochód" +
                "silnik=" + engine.toString() +
                ", maksymalna predkosc" + maxSpeed +
                ", zbiornik=" + maxFuelCapacity +
                '}';
    }
}
