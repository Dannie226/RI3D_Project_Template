package frc.lib.units;

public class Distance {
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

    public Distance(double distance, Unit unit) {
        this.meters = distance / unit.conversion;
    }

    public double get(Unit unit) {
        return this.meters * unit.conversion;
    }

    public void add(Distance d) {
        this.meters += d.meters;
    }

    public void sub(Distance d) {
        this.meters -= d.meters;
    }

    public void mul(double s) {
        this.meters *= s;
    }

    public void div(double s) {
        this.meters /= s;
    }

    public Angle div(Radius r) {
        return new Angle(this.meters / r.get(Radius.Unit.Meters), Angle.Unit.Radians);
    }

    public Radius div(Angle a) {
        return new Radius(this.meters / a.get(Angle.Unit.Radians), Radius.Unit.Meters);
    }

    public LinearVelocity div(Time t) {
        return new LinearVelocity(this.meters / t.get(Time.Unit.Seconds), Unit.Meters, Time.Unit.Seconds);
    }

    public double div(Distance d) {
        return this.meters / d.meters;
    }
}
