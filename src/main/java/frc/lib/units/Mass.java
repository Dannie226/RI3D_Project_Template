package frc.lib.units;

public class Mass extends Value<Mass.Unit, Mass> {
    public static enum Unit implements frc.lib.units.Unit {
        Kilogram(1.0),
        Gram(1000.0),
        Pound(2.20462248);

        public final double conversion;
        private Unit(double conversion) {

            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Mass(double mass, Unit unit) {
        super(mass, unit);
    }
}
