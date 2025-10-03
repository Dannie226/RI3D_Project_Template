package frc.lib.units;

public class Voltage extends Value<Voltage.Unit, Voltage> {
    public static enum Unit implements frc.lib.units.Unit {
        Volts(1.0),
        Millivolts(1000.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Voltage(double voltage, Unit unit) {
        super(voltage, unit);
    }
}
