package models;

public class Fedora extends Linux {

    public Fedora(String version) {
        super("Fedora",version);
    }

    public Fedora(String version, String desktopEnvironmentName) {
        super("Fedora", version, desktopEnvironmentName);
    }

    @Override
    public String getDefaultDesktopEnvironment() {
        return "KDE Plasma";
    }
    @Override
    public String getBootInfo() {
        return "Booting" + getName() +" " + getVersion();
    }
}
