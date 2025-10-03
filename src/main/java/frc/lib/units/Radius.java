package frc.lib.units;

public class Radius {
    public static enum Unit {
        Meters(1.0),
        Millimeters(1000.0),
        Centimeters(100.0),
        Inches(100.0 / 2.54),
        Feet(100.0 / 2.54 / 12.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }
    }

    private double meters;
    public Radius(double distance, Unit unit) {
        this.meters = distance / unit.conversion;
    }

    public double get(Unit unit) {
        return this.meters * unit.conversion;
    }

    public void add(Radius d) {
        this.meters += d.meters;
    }

    public void sub(Radius d) {
        this.meters -= d.meters;
    }

    public void mul(double s) {
        this.meters *= s;
    }

    public Distance mul(Angle a) {
        return new Distance(this.meters * a.get(Angle.Unit.Radians), Distance.Unit.Meters);
    }

    public LinearVelocity mul(AngularVelocity v) {
        return new LinearVelocity(this.meters * v.get(Angle.Unit.Radians, Time.Unit.Seconds), Distance.Unit.Meters, Time.Unit.Seconds);
    }

    public void div(double s) {
        this.meters /= s;
    }

    public double div(Radius d) {
        return this.meters / d.meters;
    }
}
