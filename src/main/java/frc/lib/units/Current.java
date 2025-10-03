package frc.lib.units;

public class Current extends Value<Current.Unit, Current> {
    public static enum Unit implements frc.lib.units.Unit {
        Ampere(1.0),
        Milliampere(1000.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Current(double current, Unit unit) {
        super(current, unit);
    }
}
