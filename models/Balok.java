package models;

public class Balok extends Object3D {
    double panjang;
    double lebar;
    double tinggi;
    @Override
    public double hitungLuasPermukaan() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public doublle hitungVolume() {
        return panjang*lebar*tinggi;
    }
}
