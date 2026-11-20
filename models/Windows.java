package models;

public class Windows extends OperatingSystem {
    public Windows(String version) {
        super("Windows", version);
    }
    public  Windows() {
        super("Windows","9");
    }
    @Override 
    public String getBootInfo (){
        return  "BOoting " + getName() + " " + getVersion();
    }
}