package models;

public class Device {
    private String ownerName; 
    private OperatingSystem operatingSystem;
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    // Constructor Overloading 1
    public Device(String ownerName, OperatingSystem operatingSystem) {
        this.ownerName = ownerName;
        this.operatingSystem = operatingSystem;
    }

    // Constructor Overloading 2 (Default OS Windows jika hanya nama yang diberikan)
    public Device(String ownerName) {
        this(ownerName, new Windows());
    }
}
