package frc.lib.units;

public class Voltage {
    public static enum Unit {
        Volts(1.0),
        Millivolts(1000.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }
    }

    private double volts;
    public Voltage(double voltage, Unit unit) {
        this.volts = voltage / unit.conversion;
    }

    public double get(Unit unit) {
        return this.volts * unit.conversion;
    }

    public void add(Voltage v) {
        this.volts += v.volts;
    }

    public void sub(Voltage v) {
        this.volts -= v.volts;
    }

    public void mul(double s) {
        this.volts *= s;
    }

    public void div(double s) {
        this.volts /= s;
    }

    public double div(Voltage v) {
        return this.volts / v.volts;
    }
}
