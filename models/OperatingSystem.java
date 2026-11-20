package models;

public abstract class OperatingSystem {
    private String name;
    private String version;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OperatingSystem(String name, String version) {
        this.name = name;
        this.version = version;
    }
    public OperatingSystem(String name) {
        this(name, "1.0");
    }
    public abstract String getBootInfo();
}
