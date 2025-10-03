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

    public void div(double s) {
        this.seconds /= s;
    }

    public double div(Time t) {
        return this.seconds / t.seconds;
    }
}
