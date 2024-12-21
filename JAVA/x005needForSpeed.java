package JAVA;

class x005needForSpeed {
    public int speed;
    public int batteryDrain;
    private int metersDrive = 0;
    private int batteryLeft = 100;
    
    x005needForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryLeft < batteryDrain;
    }

    public int distanceDriven() {
        return metersDrive;
    }

    public void drive() {
        if (batteryLeft >= batteryDrain) {
            metersDrive += speed;
            batteryLeft -= batteryDrain;
        }
    }

    public static x005needForSpeed nitro() {
        x005needForSpeed nitroCar = new x005needForSpeed(50, 4);

        return nitroCar;
    }
}

class RaceTrack {
    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(x005needForSpeed car) {
        int actualBattery = 100;
        int distanceLeft = distance;
        
        while (actualBattery > 0 && distanceLeft > 0) {
            actualBattery -= car.batteryDrain;
            distanceLeft -= car.speed;
        }
        return distanceLeft == 0;
    }
}

/*
In this exercise, you'll be organizing races between various types of remote controlled cars. Each car has its own speed and battery drain characteristics.
Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers the car's speed in meters and decreases the remaining battery percentage by its battery drain.
If a car's battery is below its battery drain percentage, you can't drive the car anymore.
Each race track has its own distance. Cars are tested by checking if they can finish the track without running out of battery.
You have six tasks, each of which will work with remote controlled car instances.

1. Allow creating a remote controlled car by defining a constructor for the NeedForSpeed class that takes the speed of the car in meters and the battery drain percentage as its two parameters (both of type int)

2. Allow creating a race track by defining a constructor for the RaceTrack class that takes the track's distance in meters as its sole parameter (which is of type int)

3. Implement the NeedForSpeed.drive() method that updates the number of meters driven based on the car's speed. Also, implement the NeedForSpeed.distanceDriven() method to return the number of meters driven by the car.

4. Update the NeedForSpeed.drive() method to drain the battery based on the car's battery drain. Also, implement the NeedForSpeed.batteryDrained() method that indicates if the battery is drained.

5. The best-selling remote control car is the Nitro, which has a stunning top speed of 50 meters with a battery drain of 4%. Implement the (static) NeedForSpeed.nitro() method to return this type of car.

6. To finish a race, a car has to be able to drive the race's distance. This means not draining its battery before having crossed the finish line. Implement the RaceTrack.canFinishRace() method that takes a NeedForSpeed instance as its parameter and returns true if the car can finish the race; otherwise, return false.
*/