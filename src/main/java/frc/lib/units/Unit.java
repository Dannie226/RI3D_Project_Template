package frc.lib.units;

public interface Unit {
    public static class MulUnit<A extends Unit, B extends Unit> implements Unit {
        public A a;
        public B b;

        public MulUnit(A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public double getConversionFactor() {
            return this.a.getConversionFactor() * this.b.getConversionFactor();
        }
    }

    public static class PerUnit<A extends Unit, B extends Unit> implements Unit {
        public A a;
        public B b;

        public PerUnit(A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public double getConversionFactor() {
            return this.a.getConversionFactor() / this.b.getConversionFactor();
        }
    }
    double getConversionFactor();
}
