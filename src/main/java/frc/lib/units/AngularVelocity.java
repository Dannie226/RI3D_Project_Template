package frc.lib.units;

public class AngularVelocity {
    private double radPerSec;

    public AngularVelocity(double vel, Angle.Unit angleUnit, Time.Unit timeUnit) {
        this.radPerSec = vel * timeUnit.conversion / angleUnit.conversion;
    }

    public double get(Angle.Unit angleUnit, Time.Unit timeUnit) {
        return this.radPerSec * angleUnit.conversion / timeUnit.conversion;
    }

    public void add(AngularVelocity a) {
        this.radPerSec += a.radPerSec;
    }

    public void sub(AngularVelocity a) {
        this.radPerSec -= a.radPerSec;
    }

    public void mul(double s) {
        this.radPerSec *= s;
    }

    public Angle mul(Time t) {
        return new Angle(this.radPerSec * t.get(Time.Unit.Seconds), Angle.Unit.Radians);
    }

    public LinearVelocity mul(Radius r) {
        return new LinearVelocity(this.radPerSec * r.get(Radius.Unit.Meters), Distance.Unit.Meters, Time.Unit.Seconds);

    }

    public void div(double s) {
        this.radPerSec /= s;
    }

    public double div(AngularVelocity a) {
        return this.radPerSec / a.radPerSec;
    }
}
