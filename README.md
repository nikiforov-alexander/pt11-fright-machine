# Techdegree project 11
### Fright Machine: Design Patterns
<hr>

### Table of Contents
### Installation instructions
* [Eclipse installation instructions.] (#eclipse)

<hr>

### Misc
- [Quick Links to files and directories] (#links)
- [Notes about project] (#notes)


<hr>

### Tasks
* [1.] (#task-1) 
    Use the Observer design pattern to allow all 
    accessories to be plugged in.
    <hr>
* [2.] (#task-2) 
    Use another design pattern to adapt the camera 
    to be an accessory.
    <hr>
* [3.] (#task-3) 
    Ensure unit tests pass.
    <hr>

<!--Links-->

<!--Java-->

[Main]:
    ./src/main/java/com/teamtreehouse/techdegree/Main.java "./src/main/java/com/teamtreehouse/techdegree/Main.java"
[DeviceWithIntArgAdaptedAsAccessory]:
    ./src/main/java/com/teamtreehouse/techdegree/hardware/DeviceWithIntArgAdaptedAsAccessory.java "./src/main/java/com/teamtreehouse/techdegree/hardware/DeviceWithIntArgAdaptedAsAccessory.java"
[Camera]:
    ./src/main/java/com/teamtreehouse/techdegree/hardware/Camera.java "./src/main/java/com/teamtreehouse/techdegree/hardware/Camera.java"
[FrightMachine]:
    ./src/main/java/com/teamtreehouse/techdegree/hardware/FrightMachine.java "./src/main/java/com/teamtreehouse/techdegree/hardware/FrightMachine.java"
[Horn]:
    ./src/main/java/com/example/accessory/Horn.java "./src/main/java/com/example/accessory/Horn.java"
[Accessory]:
    ./src/main/java/com/example/accessory/Accessory.java "./src/main/java/com/example/accessory/Accessory.java"
[Strobe]:
    ./src/main/java/com/example/accessory/Strobe.java "./src/main/java/com/example/accessory/Strobe.java"
[MotionDetector]:
    ./src/main/java/com/example/motion/MotionDetector.java "./src/main/java/com/example/motion/MotionDetector.java"
[FrightMachineTest]:
    ./src/test/java/com/teamtreehouse/techdegree/hardware/FrightMachineTest.java "./src/test/java/com/teamtreehouse/techdegree/hardware/FrightMachineTest.java"

[build.gradle]:
    ./build.gradle "./build.gradle"
    

### Eclipse Installation instructions
<hr> <a id="eclipse"></a>
Under construction...

### Tasks
1. <a id="task-1"></a>
    Use the Observer design pattern to allow all 
    accessories to be plugged in.
    <hr>
    [FrightMachine] has a member `List<Acessory> accessories`.
    They are observers. They can be added or removed. And
    all of them in `@Override`-n method `onMotionDetected`
    will be activated by calling their method:
    `Accessory.activate`. 
    <hr>
    This method takes no arguments and also returns nothing,
    just prints to console using `System.out.println`.
    <hr>
    `onMotionDetected` is the main method that will be used
     in our runnable methods [Main] and [FrightMachineTest].
    <hr>
    Both [Horn] and [Strobe] can be easily added to `accessories`
    as observers, which they are in [Main] and 
    [FrightMachineTest].
<hr>
