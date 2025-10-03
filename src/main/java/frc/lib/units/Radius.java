package frc.lib.units;

public class Radius {
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

    public void div(double s) {
        this.meters /= s;
    }

    public double div(Radius d) {
        return this.meters / d.meters;
    }
}
