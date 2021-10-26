package dziedziczenie;

public class Vehicles {


    //public String type; // lodzie, samochody, samoloty, motocykle, itd. itp.
    public Engine engine;
    public double maxSpeed;
    public double maxFuelCapacity;

    public Vehicles(Engine engine, double maxSpeed, double maxFuelCapacity) {
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.maxFuelCapacity = maxFuelCapacity;
    }
}
