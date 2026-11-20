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
        return this.getLebar()* 2 + (this.getPanjang());
    }
    @Override
    public double hitungLuas() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String[][] getKeyValueDetails() {
        
        return null;
    }
}
