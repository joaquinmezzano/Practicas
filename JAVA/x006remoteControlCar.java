package JAVA;

public interface x006remoteControlCar {
    void drive();
    int getDistanceTravelled();
}

/*
In this exercise you will be doing some more work on remote control cars.

An experimental car has been developed and the test track needs to be adapted to handle both production and experimental models. The two types of car have already been built and you need to find a way to deal with them both on the test track.

In addition, production cars are beginning to have some success. The team boss is keen to maintain the competitive spirit by publishing a ranking of the production cars:

1. Please add two methods to the RemoteControlCar interface:

    drive(), returning nothing, and
    getDistanceTravelled(), returning an int.

Then make ProductionRemoteControlCar and ExperimentalRemoteControlCar implement the RemoteControlCar interface. This includes implementing all methods required by the interface.

2. Each call of .drive() should make the car travel a certain distance:

    a ProductionRemoteControlCar drives 10 units,
    an ExperimentalRemoteControlCar drives 20 units.

The .getDistanceTravelled() method should return the number of units that the car has travelled in its lifetime.

3. Implement the TestTrack.race(RemoteControlCar car) method in which the cars get to drive().

4. Please implement the Comparable<T> interface in the ProductionRemoteControlCar class. The default sort order for cars should be descending order of victories.

Implement the static TestTrack.getRankedCars() to return the cars passed in, sorted in descending order of number of victories.
 */