package controllers;

import java.util.List;

import exceptions.EmptyListException;
import models.Device;
import models.OperatingSystem;

public interface IDeviceController {
    void addDevice(Device device);
    void addDevice(String ownerName, OperatingSystem os);
    List<Device> getAllDevices() throws EmptyListException;
    List<Device> getSortedDevicesByOS() throws EmptyListException;
}