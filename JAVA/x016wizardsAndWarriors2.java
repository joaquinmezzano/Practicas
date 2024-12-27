package JAVA;

public class x016wizardsAndWarriors2 {
    public String describe (x016character pj) {
        return "You're a level "+pj.getLevel()+" "+pj.getCharacterClass()+" with "+pj.getHitPoints()+" hit points.";
    }

    public String describe (x016destination des) {
        return "You've arrived at "+des.getName()+", which has "+des.getInhabitants()+" inhabitants.";
    }
    
    public String describe (x016travelMethod tm) {
        return tm == x016travelMethod.WALKING ? "You're traveling to your destination by walking." : "You're traveling to your destination on horseback.";
    }

    public String describe (x016character pj, x016destination des, x016travelMethod tm) {
        return describe(pj)+" "+describe(tm)+" "+describe(des);
    }
    
    public String describe (x016character pj, x016destination des) {
        return describe(pj)+" "+describe(x016travelMethod.WALKING)+" "+describe(des);
    }
}

/*
In this exercise you're playing a role-playing game named "Wizard and Warriors" with your best friends. You are the Game Master, the person tasked with making the game world come alive for the players. A key aspect of this is describing the game to the players: what is a character's status, what the town they're visiting looks like, etc.

You have five tasks that have you describe parts of the game to the players:

1. Each character has a class, level and number of hit points and is described as: "You're a level <LEVEL> <CLASS> with <HIT_POINTS> hit points.". Implement the GameMaster.describe method that takes a Character as its sole parameter and returns its description.

2. Each destination has a name and a number of inhabitants and is described as: "You've arrived at <NAME>, which has <INHABITANTS> inhabitants.". Implement the GameMaster.describe method that takes a Destination as its sole parameter and returns its description.

3. Characters can travel to a destination using one of two options:

    Walking, described as: "You're traveling to your destination by walking."
    On horseback, described as: "You're traveling to your destination on horseback."

Implement the GameMaster.describe method that takes a TravelMethod as its sole parameter and returns its description.

4. When a character is traveling to a destination, this is described as a combination of the individual descriptions: "<CHARACTER> <TRAVEL_METHOD> <DESTINATION>". Implement the GameMaster.describe method that takes a Character, a Destination and a TravelMethod as its parameters and return its description.

5. In the majority of cases, characters are traveling to a destination by walking. For convenience, players are allowed to omit mentioning their travel method, in which case walking will be assumed to be the travel method. Implement the GameMaster.describe method that takes a Character and a Destination as its parameters and return its description.
 */
