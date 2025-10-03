package frc.lib.units;

public class Resistance extends Value<Resistance.Unit, Resistance> {
    public static enum Unit implements frc.lib.units.Unit {
        Ohms(1.0),
        Milliohms(1000.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Resistance(double resistance, Unit unit) {
        super(resistance, unit);
    }

    public Voltage mul(Current c) {
        return new Voltage(this.value * c.value, Voltage.Unit.Volts);
    }
}
