package com.teamtreehouse.techdegree;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.DeviceWithIntArgAdaptedAsAccessory;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {

    public static void main(String[] args) {
        // instantiate new FrightMachine
        FrightMachine machine = new FrightMachine();

        // create three accessories to plug in
        // fright machine
        Horn horn = new Horn();
        Strobe strobe = new Strobe();
        Camera camera = new Camera();

        // add observers as accessories
        machine.addObserver(horn);
        machine.addObserver(strobe);
        machine.addObserver(
                new DeviceWithIntArgAdaptedAsAccessory(
                        camera::snapPhotos,
                        5)
        );
        // simulate machine motion: call horn,strobe and camera methods
        machine.simulateMotion();
    }
}
