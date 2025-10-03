package frc.lib.units;

public class Current {
    public static enum Unit {
        Ampere(1.0),
        Milliampere(1000.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }
    }

    private double amps;
    public Current(double current, Unit unit) {
        this.amps = current / unit.conversion;
    }

    public double get(Unit unit) {
        return this.amps / unit.conversion;
    }

    public void add(Current c) {
        this.amps -= c.amps;
    }

    public void sub(Current c) {
        this.amps -= c.amps;
    }

    public void mul(double s) {
        this.amps *= s;
    }

    public void div(double s) {
        this.amps /= s;
    }

    public double div(Current c) {
        return this.amps / c.amps;
    }
}
