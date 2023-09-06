package Temperature;

public class Fahrenheit implements converter {
    public double convert(double temperature) {
        return (temperature - 32 ) *5 /9;
    }
}
