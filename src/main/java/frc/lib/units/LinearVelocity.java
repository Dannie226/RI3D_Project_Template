package frc.lib.units;

public class LinearVelocity {
    private double metersPerSecond;

    public LinearVelocity(double velocity, Distance.Unit distanceUnit, Time.Unit timeUnit) {
        this.metersPerSecond = velocity * timeUnit.conversion / distanceUnit.conversion;
    }

    public double get(Distance.Unit distanceUnit, Time.Unit timeUnit) {
        return this.metersPerSecond * distanceUnit.conversion / timeUnit.conversion;
    }

    public void add(LinearVelocity v) {
        this.metersPerSecond += v.metersPerSecond;
    }

    public void sub(LinearVelocity v) {
        this.metersPerSecond -= v.metersPerSecond;
    }

    public void mul(double s) {
        this.metersPerSecond *= s;
    }

    public Distance mul(Time t) {
        return new Distance(this.metersPerSecond * t.get(Time.Unit.Seconds), Distance.Unit.Meters);
    }

    public void div(double s) {
        this.metersPerSecond /= s;
    }

    public AngularVelocity div(Radius r) {
        return new AngularVelocity(this.metersPerSecond / r.get(Radius.Unit.Meters), Angle.Unit.Radians, Time.Unit.Seconds);
    }

    public double div(LinearVelocity v) {
        return this.metersPerSecond / v.metersPerSecond;
    }
}
