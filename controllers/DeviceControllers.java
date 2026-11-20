package controllers;

import exceptions.EmptyListException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Device;
import models.OperatingSystem;

public class DeviceControllers implements IDeviceController {
    private final List<Device> devices;

    public DeviceControllers() {
        this.devices = new ArrayList<>();
    }

    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Implementasi Method Overloading
    @Override
    public void addDevice(String ownerName, OperatingSystem os) {
        devices.add(new Device(ownerName, os));
    }

    @Override
    public List<Device> getAllDevices() throws EmptyListException {
        if (devices.isEmpty()) {
            throw new EmptyListException();
        }
        return new ArrayList<>(devices);
    }

    @Override
    public List<Device> getSortedDevicesByOS() throws EmptyListException {
        if (devices.isEmpty()) {
            throw new EmptyListException();
        }
        List<Device> sortedList = new ArrayList<>(devices);
        sortedList.sort(Comparator.comparing(d -> d.getOperatingSystem().getName()));
        return sortedList;
    }


}
