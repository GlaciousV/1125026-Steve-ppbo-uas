package models;

public abstract class Linux extends OperatingSystem {
    private String desktopEnvironmentName;

    public Linux(String name, String version) {
        super(name, version);
        this.desktopEnvironmentName = getDefaultDesktopEnvironment();
    }

    public Linux(String name, String version, String desktopEnvironmentName) {
        super(name, version);
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

    public String getDesktopEnvironmentName() {
        return desktopEnvironmentName;
    }

    public void setDesktopEnvironmentName(String desktopEnvironmentName) {
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

    // Abstract method khusus Linux sesuai soal
    public abstract String getDefaultDesktopEnvironment();
}