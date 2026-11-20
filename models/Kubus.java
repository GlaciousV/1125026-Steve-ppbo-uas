package models;

public class Kubus extends Object3D{
    double sisi;
    public double getSisi() {
        return sisi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return  6*(sisi*sisi);
    }
    @Override
    public double hitungVolume() {
        return sisi*sisi*sisi;
    }
    @Override
    public String[][] getKeyValueDetails() {
        return null;
    }
}