package frc.lib.units;

public class Temperature {
    public static enum Unit {
        Celsius,
        Fahrenheit,
    }

    private double celsius;

    public Temperature(double temperature, Unit unit) {
        switch (unit) {
            case Celsius:
                this.celsius = temperature;
                break;
        
            case Fahrenheit:
                this.celsius = (temperature - 32.0) * 5.0 / 9.0;
                break;
        }
    }

    public double get(Unit unit) {
        switch (unit) {
            case Celsius:
                return this.celsius;
        
            case Fahrenheit:
                return this.celsius * 9.0 / 5.0 + 32;
        }

        throw new NullPointerException();
    }

    public void add(Temperature t) {
        this.celsius += t.celsius;
    }

    public void sub(Temperature t) {
        this.celsius -= t.celsius;
    }

    public void mul(double s) {
        this.celsius *= s;
    }

    public void div(double s) {
        this.celsius /= s;
    }

    public double div(Temperature t) {
        return this.celsius / t.celsius;
    }
}
