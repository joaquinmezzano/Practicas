package JAVA;

import java.util.Collections;
import java.util.List;

public class x006testTrack {
    public static void race(x006remoteControlCar car) {
        car.drive();
    }

    public static List<x006productionRemoteControlCar> getRankedCars(List<x006productionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}
