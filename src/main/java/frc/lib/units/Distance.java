package frc.lib.units;

public class Distance extends Value<Distance.Unit, Distance> {
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

    public Distance(double distance, Unit unit) {
        super(distance, unit);
    }

    public Angle div(Radius r) {
        return new Angle(this.value / r.value, Angle.Unit.Radians);
    }

    public Radius div(Angle a) {
        return new Radius(this.value / a.value, Radius.Unit.Meters);
    }

    public LinearVelocity div(Time t) {
        return new LinearVelocity(this.value / t.value, Unit.Meters, Time.Unit.Seconds);
    }
}
