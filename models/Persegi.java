package models;

public class Persegi extends Object2D {
    double sisi;
    
    public double getSisi() {
        return sisi;
    }

    @Override
    public double hitungKeliling() {
        return this.sisi * 4;
    }
    @Override
    public double hitungLuas() {
        return this.sisi * this.sisi;
    }
    @Override
    public String[][] getKeyValueDetails() {
        
        return null;
    }
}
