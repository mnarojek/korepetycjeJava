package dziedziczenie;

public class Engine {
    public String type;
    public double volume;

    public Engine(String type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Silnik " +
                "typ=" + type +
                ", pojemność silnika w litrach=" + volume;
    }
}
