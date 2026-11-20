package models;

public class Kerucut extends  Object2D {
    double jariJari;
    double tinggi;
    @Override
    public double hitungKeliling() {
        return 3.14* jariJari *(tinggi+jariJari);
    }
    @Override
    public double hitungLuas() {
        return 0;
    }
    @Override
    public String[][] getKeyValueDetails() {
        return null;
    }
}
