package JAVA;

public class x006experimentalRemoteControlCar implements x006remoteControlCar {
    int totalDistance = 0;
    
    public void drive() {
        totalDistance += 20;
    }

    public int getDistanceTravelled() {
        return totalDistance;
    }
}
