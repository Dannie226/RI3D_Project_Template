package frc.lib.units;

import frc.lib.units.Unit.PerUnit;

public class AngularVelocity extends Value<PerUnit<Angle.Unit, Time.Unit>, AngularVelocity> {
    public AngularVelocity(double vel, Angle.Unit angleUnit, Time.Unit timeUnit) {
        super(vel, new PerUnit<>(angleUnit, timeUnit));
    }

    public Angle mul(Time t) {
        return new Angle(this.value * t.get(Time.Unit.Seconds), Angle.Unit.Radians);
    }

    public LinearVelocity mul(Radius r) {
        return new LinearVelocity(this.value * r.get(Radius.Unit.Meters), Distance.Unit.Meters, Time.Unit.Seconds);

    }
}
