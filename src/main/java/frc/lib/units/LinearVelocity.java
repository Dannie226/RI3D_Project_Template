package frc.lib.units;

import frc.lib.units.Unit.PerUnit;

public class LinearVelocity extends Value<PerUnit<Distance.Unit, Time.Unit>, LinearVelocity> {
    public LinearVelocity(double velocity, Distance.Unit distanceUnit, Time.Unit timeUnit) {
        super(velocity, new PerUnit<>(distanceUnit, timeUnit));
    }

    public Distance mul(Time t) {
        return new Distance(this.value * t.value, Distance.Unit.Meters);
    }

    public AngularVelocity div(Radius r) {
        return new AngularVelocity(this.value / r.value, Angle.Unit.Radians, Time.Unit.Seconds);
    }
}
