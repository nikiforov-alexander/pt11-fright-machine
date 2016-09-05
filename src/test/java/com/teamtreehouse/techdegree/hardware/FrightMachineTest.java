package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class FrightMachineTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    private FrightMachine machine;

    @Before
    public void setUp() throws Exception {
        // instantiate new fright machine
        machine = new FrightMachine();
        // create three accessories to plug
        Horn horn = new Horn();
        Strobe strobe = new Strobe();
        Camera camera = new Camera();

        // add observers to machine
        machine.addObserver(horn);
        machine.addObserver(strobe);
        machine.addObserver(
                new DeviceWithIntArgAdaptedAsAccessory(
                        camera::snapPhotos, 5
                )
        );
    }

    @Test
    public void whenMotionIsDetectedExpectedPluginsKickOff() throws Exception {
        machine.simulateMotion();
        assertThat(systemOutRule.getLog(), allOf(containsString("BEEEEEEEP"),
                                                 containsString("Flashing lights"),
                                                 containsString("Photo #5 taken")));
    }
}