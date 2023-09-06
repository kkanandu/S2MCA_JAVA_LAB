package Temperature;

public class Celsius implements converter {
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}
