package frc.lib.units;

public class Radius extends Value<Radius.Unit, Radius> {
    public static enum Unit implements frc.lib.units.Unit {
        Meters(1.0),
        Millimeters(1000.0),
        Centimeters(100.0),
        Inches(100.0 / 2.54),
        Feet(100.0 / 2.54 / 12.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Radius(double distance, Unit unit) {
        super(distance, unit);
    }

    public Distance mul(Angle a) {
        return new Distance(this.value * a.value, Distance.Unit.Meters);
    }

    public LinearVelocity mul(AngularVelocity v) {
        return new LinearVelocity(this.value * v.value, Distance.Unit.Meters, Time.Unit.Seconds);
    }
}
