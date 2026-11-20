package models;

public class Ubuntu extends Linux {

    public Ubuntu(String version) {
        super("Ubuntu",version);
    }

    public Ubuntu(String version, String desktopEnvironmentName) {
        super("Ubuntu", version, desktopEnvironmentName);
    }

    @Override
    public String getDefaultDesktopEnvironment() {
        return "Gnome";
    }
    @Override
    public String getBootInfo() {
        return "Booting" + " "+getName() +" " + getVersion();
    }
}
