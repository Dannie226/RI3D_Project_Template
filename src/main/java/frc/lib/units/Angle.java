package frc.lib.units;

public class Angle {
    public static enum Unit {
        Radians(1.0),
        Revolutions(1.0 / 2 * Math.PI),
        Degrees(180.0 / Math.PI);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }
    }

    private double radians;

    public Angle(double angle, Unit unit) {
        this.radians = angle / unit.conversion;
    }

    public double get(Unit unit) {
        return this.radians * unit.conversion;
    }

    public void add(Angle a) {
        this.radians += a.radians;
    }

    public void sub(Angle a) {
        this.radians -= a.radians;
    }

    public void mul(double s) {
        this.radians *= s;
    }

    public void div(double s) {
        this.radians /= s;
    }

    public double div(Angle a) {
        return this.radians / a.radians;
    }
}
