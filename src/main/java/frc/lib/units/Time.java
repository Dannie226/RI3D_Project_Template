package frc.lib.units;

import frc.lib.units.Unit.PerUnit;

public class Time extends Value<Time.Unit, Time> {
    public static enum Unit implements frc.lib.units.Unit {
        Seconds(1.0),
        Minutes(1.0 / 60.0),
        Hours(1.0 / 60.0 / 60.0),
        Milliseconds(1000.0);

        public final double conversion;

        private Unit(double conversion) {
            this.conversion = conversion;
        }

        @Override
        public double getConversionFactor() {
            return conversion;
        }
    }

    public Time(double time, Unit unit) {
        super(time, unit);
    }

    public Distance mul(LinearVelocity v) {
        return new Distance(this.value * v.get(new PerUnit<>(Distance.Unit.Meters, Time.Unit.Seconds)), Distance.Unit.Meters);
    }

    public Angle mul(AngularVelocity v) {
        return new Angle(this.value * v.get(new PerUnit<>(Angle.Unit.Radians, Time.Unit.Seconds)), Angle.Unit.Radians);
    }
}
