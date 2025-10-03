package frc.lib.units;

public class Time {
    public static enum Unit {
        Seconds(1.0),
        Minutes(1.0 / 60.0),
        Hours(1.0 / 60.0 / 60.0),
        Milliseconds(1000.0);

        public final double conversion;

        private Unit(double conversion) {
            this.conversion = conversion;
        }
    }

    private double seconds;

    public Time(double time, Unit unit) {
        this.seconds = time / unit.conversion;
    }

    public double get(Unit unit) {
        return this.seconds * unit.conversion;
    }

    public void add(Time t) {
        this.seconds += t.seconds;
    }

    public void sub(Time t) {
        this.seconds -= t.seconds;
    }

    public void mul(double s) {
        this.seconds *= s;
    }

    public Distance mul(LinearVelocity v) {
        return new Distance(this.seconds * v.get(Distance.Unit.Meters, Time.Unit.Seconds), Distance.Unit.Meters);
    }

    public Angle mul(AngularVelocity v) {
        return new Angle(this.seconds * v.get(Angle.Unit.Radians, Time.Unit.Seconds), Angle.Unit.Radians);
    }

    public void div(double s) {
        this.seconds /= s;
    }

    public double div(Time t) {
        return this.seconds / t.seconds;
    }
}
