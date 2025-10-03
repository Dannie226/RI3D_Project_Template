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

    public void div(double s) {
        this.metersPerSecond /= s;
    }

    public double div(LinearVelocity v) {
        return this.metersPerSecond / v.metersPerSecond;
    }
}
