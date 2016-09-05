package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;

import java.util.function.Consumer;

public class DeviceWithIntArgAdaptedAsAccessory implements Accessory {
    // here we use Consumer, to adapt all Devices like
    // Camera that have method that takes `int` and
    // returns void
    private Consumer<Integer> observer;
    // this number will be passed in constructor
    private int number;

    // The constructor takes two parameters : method on
    // camera-like device and integer to pass to that method
    public DeviceWithIntArgAdaptedAsAccessory(
            Consumer<Integer> observer,
            int number) {
        this.observer = observer;
        this.number = number;
    }

    // with this method we make Camera Accessory, inside
    // we execute whatever method was passed to constructor
    // with consumer, in case of camera: snapPhotos(5)
    @Override
    public void activate() {
        observer.accept(number);
    }
}
