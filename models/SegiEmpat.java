package models;

public class SegiEmpat extends Object2D {
    double panjang;
    double lebar;
    
    public double getLebar() {
        return lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    @Override
    public double hitungKeliling() {
        return this.lebar * 2 + (this.panjang* 2);
    }
    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }
    @Override
    public String[][] getKeyValueDetails() {
        
        return null;
    }
}
