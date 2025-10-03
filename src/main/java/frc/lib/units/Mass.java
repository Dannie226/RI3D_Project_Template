package frc.lib.units;

public class Mass {
    public static enum Unit {
        Kilogram(1.0),
        Gram(1000.0),
        Pound(2.20462248);

        public final double conversion;
        private Unit(double conversion) {

            this.conversion = conversion;
        }
    }

    private double kilograms;
    public Mass(double mass, Unit unit) {
        this.kilograms = mass / unit.conversion;
    }

    public double get(Unit unit) {
        return this.kilograms * unit.conversion;
    }

    public void add(Mass m) {
        this.kilograms += m.kilograms;
    }

    public void sub(Mass m) {
        this.kilograms -= m.kilograms;
    }

    public void mul(double s) {
        this.kilograms *= s;
    }

    public void div(double s) {
        this.kilograms /= s;
    }

    public double div(Mass m) {
        return this.kilograms / m.kilograms;
    }
}
