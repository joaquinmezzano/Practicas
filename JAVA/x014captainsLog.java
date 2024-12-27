package JAVA;

import java.util.Random;

public class x014captainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    x014captainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        return "NCC-"+random.nextInt(1000, 10000);
    }

    double randomStardate() {
        return random.nextDouble(41000.0, 42000.0);
    }
}

/*
Mary is a big fan of the TV series Star Trek: The Next Generation. She often plays pen-and-paper role playing games, where she and her friends pretend to be the crew of the Starship Enterprise. Mary's character is Captain Picard, which means she has to keep the captain's log. She loves the creative part of the game, but doesn't like to generate random data on the spot.

Help Mary by creating random generators for data commonly appearing in the captain's log.
Note

The starter implementation of this exercise takes a java.util.Random instance as constructor argument. This allows the exercise's tests to pass an instance with a predefined seed, which makes the test results predictable.

Therefore, you are expected to use the provided java.util.Random instance in your implementation.

1. The Starship Enterprise encounters many planets in its travels. Planets in the Star Trek universe are split into categories based on their properties. For example, Earth is a class M planet. All possible planetary classes are: D, H, J, K, L, M, N, R, T, and Y.

Implement the randomPlanetClass() method. It should return one of the planetary classes at random.

2. Enterprise (registry number NCC-1701) is not the only starship flying around! When it rendezvous with another starship, Mary needs to log the registry number of that starship.

Registry numbers start with the prefix "NCC-" and then use a number from 1000 to 9999 (inclusive).

Implement the randomShipRegistryNumber() method that returns a random starship registry number.

3. What's the use of a log if it doesn't include dates?

A stardate is a floating point number. The adventures of the Starship Enterprise from the first season of The Next Generation take place between the stardates 41000.0 and 42000.0. The "4" stands for the 24th century, the "1" for the first season.

Implement the randomStardate() method that returns a floating point number between 41000.0 (inclusive) and 42000.0 (exclusive).
 */
