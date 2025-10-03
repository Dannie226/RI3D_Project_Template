package frc.lib.units;

public class Resistance {
    public static enum Unit {
        Ohms(1.0),
        Milliohms(1000.0);

        public final double conversion;
        private Unit(double conversion) {
            this.conversion = conversion;
        }
    }

    private double ohms;

    public Resistance(double resistance, Unit unit) {
        this.ohms = resistance / unit.conversion;
    }

    public double get(Unit unit) {
        return this.ohms * unit.conversion;
    }

    public void add(Resistance resistance) {
        this.ohms += resistance.ohms;
    }

    public void sub(Resistance resistance) {
        this.ohms -= resistance.ohms;
    }

    public void mul(double s) {
        this.ohms *= s;
    }

    public void div(double s) {
        this.ohms /= s;
    }

    public double div(Resistance s) {
        return this.ohms / s.ohms;
    }
}
