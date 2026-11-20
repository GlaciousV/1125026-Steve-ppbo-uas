package models;

public class Lingkaran extends Object2D {
    double jariJari;
    @Override
    public double hitungKeliling() {
        return 2* 3.14 * jariJari;
    }
    @Override
    public double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }
    @Override
    public String[][] getKeyValueDetails() {
        return null;
    }
}
