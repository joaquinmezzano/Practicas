package JAVA;

public class x006productionRemoteControlCar implements x006remoteControlCar, Comparable<x006productionRemoteControlCar> {
    int totalDistance = 0;
    int numberOfVictories;

    public void drive() {
        totalDistance += 10;
    }

    public int getDistanceTravelled() {
        return totalDistance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(x006productionRemoteControlCar o){
        return Integer.compare(o.numberOfVictories, this.numberOfVictories);
    }
}
