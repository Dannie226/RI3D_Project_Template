package frc.lib.units;

public class Temperature extends Value<Temperature.Unit, Temperature> {
    public static enum Unit implements frc.lib.units.Unit {
        Celsius,
        Fahrenheit;

        @Override
        public double getConversionFactor() {
            return 0;
        }
    }

    public Temperature(double temperature, Unit unit) {
        super(0, unit);
        switch (unit) {
            case Celsius:
                this.value = temperature;
                break;
        
            case Fahrenheit:
                this.value = (temperature - 32.0) * 5.0 / 9.0;
                break;
        }
    }

    @Override
    public double get(Unit unit) {
        switch (unit) {
            case Celsius:
                return this.value;
        
            case Fahrenheit:
                return this.value * 9.0 / 5.0 + 32.0;
        }

        throw new NullPointerException();
    }
}
