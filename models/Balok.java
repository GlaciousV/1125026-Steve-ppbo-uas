package models;

public class Balok extends Object3D {
    double panjang;
    double lebar;
    double tinggi;
    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }
    @Override
    public doublle hitungVolume() {
        return panjang*lebar*tinggi;

    }
    @Override
    public String[][] getKeyValueDetails() {
        return null;
    }
}
