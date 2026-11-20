import controllers.DeviceControllers;
import controllers.IDeviceController;
import views.DeviceView;

public class Main {
    public static void main(String[] args) {
        IDeviceController controller = new DeviceControllers();
        DeviceView view = new DeviceView(controller);
        view.run();
    }
}