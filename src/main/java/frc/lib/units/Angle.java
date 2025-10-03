package frc.lib.units;

public class Angle extends Value<Angle.Unit, Angle> {
    public static enum Unit implements frc.lib.units.Unit {
        Radians(1.0),
        Revolutions(1.0 / 2 * Math.PI),
        Degrees(180.0 / Math.PI);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Angle(double angle, Unit unit) {
        super(angle, unit);
    }

    public Distance mul(Radius r) {
        return new Distance(this.value * r.value, Distance.Unit.Meters);
    }

    public AngularVelocity div(Time t) {
        return new AngularVelocity(this.value / t.value, Unit.Radians, Time.Unit.Seconds);
    }
}
