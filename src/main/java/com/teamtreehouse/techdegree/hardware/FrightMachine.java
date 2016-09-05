package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.List;

public class FrightMachine extends MotionDetector {
    // list of accessories: observers
    private List<Accessory> accessories =
            new ArrayList<>();

    // nothing here, can in principle be
    // constructor with List<Accessory>, but
    // let it be like this for now
    public FrightMachine() {
    }

    // method filling Fright Machine with accessories
    public void addObserver(Accessory accessory) {
        accessories.add(accessory);
    }

    // remove observers: when we finish, we remove them
    public void removeObserver(Accessory accessory) {
        accessories.remove(accessory);
    }

    // method triggering all accessories to
    // execute their accessory.activate() method
    @Override
    public void onMotionDetected() {
        accessories.forEach(
                Accessory::activate
        );
    }
}
