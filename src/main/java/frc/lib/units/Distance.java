package frc.lib.units;

public class Distance {
    public static enum Unit {
        Meter(1.0),
        Millimeter(1000.0),
        Centimeter(100.0),
        Inches(100.0 / 2.54),
        Foot(100.0 / 2.54 / 12.0);

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
        return new Angle(this.meters / r.get(Radius.Unit.Meter), Angle.Unit.Radians);
    }

    public Radius div(Angle a) {
        return new Radius(this.meters / a.get(Angle.Unit.Radians), Radius.Unit.Meter);
    }

    public double div(Distance d) {
        return this.meters / d.meters;
    }
}
