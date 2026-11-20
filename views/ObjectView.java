package views;

import  java.util.*;

import controllers.*;
import exceptions.*;
import models.*;
import utils.*;

public class ObjectView {
    private final IDeviceController controller;

    public ObjectView(IDeviceController controller) {
        this.controller = controller;
    }

    public void run() {
        int choice = -1;
        while (choice != 0) {
            printMainMenu();
            choice = CLIUtils.getInt();

            try {
                handleMenuChoice(choice);
            } catch (InvalidMenuException | InvalidOSException | EmptyListException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void printMainMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tampilkan Semua");
        System.out.println("2. Tambah Persegi");
        System.out.println("3. Tampilkan semua device terurut berdasarkan OS");
        System.out.println("0. Keluar");
    }

    private void handleMenuChoice(int choice) throws InvalidMenuException, InvalidOSException, EmptyListException {
        switch (choice) {
            case 1:
                handleAddDevice();
                break;
            case 2:
                handleShowAllDevices();
                break;
            case 3:
                handleShowSortedDevices();
                break;
            case 0:
                break;
            default:
                throw new InvalidMenuException(choice);
        }
    }

    private void handleAddDevice() throws InvalidOSException {
        System.out.println("Masukan Nama Pengguna : ");
        String ownerName = CLIUtils.getString();
        System.out.println("Pilih OS: 1. Windows, 2. Ubuntu, 3. Fedora");
        int osChoice = CLIUtils.getInt();

        if (osChoice < 1 || osChoice > 3) {
            throw new InvalidOSException(osChoice);
        }
        System.out.println("masukan versi : ");
        String version = CLIUtils.getString();

        OperatingSystem os = createOperatingSystem(osChoice, version);
        controller.addDevice(ownerName, os);
    }

    private OperatingSystem createOperatingSystem(int osChoice, String version) throws InvalidOSException {
        switch (osChoice) {
            case 1:
                return new Windows(version);
            case 2:
                return new Ubuntu(version);
            case 3:
                return new Fedora(version);

            default:
                throw new InvalidOSException(osChoice);
        }
    }

    private void handleShowAllDevices() throws EmptyListException {
        List<Device> devices = controller.getAllDevices();
        displayDevices(devices);
    }

    private void handleShowSortedDevices() throws EmptyListException {
        List<Device> sortedDevices = controller.getSortedDevicesByOS();
        displayDevices(sortedDevices);
    }

    private void displayDevices(List<Device> devices) {
        for (Device device : devices) {
            System.out.println(device.getOwnerName() + " booted: " + device.getOperatingSystem().getBootInfo());
        }
    }
}