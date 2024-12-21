package JAVA;

public class x004elonsToyCar {
    private int distance = 0;
    private int battery = 100;
    
    public static x004elonsToyCar buy() {
        x004elonsToyCar car = new x004elonsToyCar();

        return car;
    }

    public String distanceDisplay() {
        return "Driven "+distance+" meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        
        return "Battery at "+battery+"%";
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}

/*
In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.
Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.
The remote controlled car has a fancy LED display that shows two bits of information:

    The total distance it has driven, displayed as: "Driven <METERS> meters".
    The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".

If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".
You have six tasks, each of which will work with remote controlled car instances:

1. Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance.
2. Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display.
3. Implement the ElonsToyCar.batteryDisplay() method to return the battery percentage as displayed on the LED display.
4. Implement the ElonsToyCar.drive() method that updates the number of meters driven.
5. Update the ElonsToyCar.drive() method to update the battery percentage.
6. Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%).
*/