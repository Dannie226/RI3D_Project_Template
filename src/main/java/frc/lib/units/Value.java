package frc.lib.units;

public class Value<U extends Unit, V extends Value<U, V>> {
    protected double value;

    public Value(double value, U unit) {
        this.value = value / unit.getConversionFactor();
    }

    public double get(U unit) {
        return this.value * unit.getConversionFactor();
    }

    public void add(V v) {
        this.value += v.value;
    }

    public void sub(V v) {
        this.value -= v.value;
    }

    public void mul(double s) {
        this.value *= s;
    }

    public void div(double s) {
        this.value /= s;
    }

    public double div(V v) {
        return this.value / v.value;
    }
}
