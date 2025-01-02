public class x023darts {
    int score(double xOfDart, double yOfDart) {
        final int totalRadius = 10;
        final int middleRadius = 5;
        final int innerRadius = 1;
        double x2 = Math.pow(xOfDart, 2);
        double y2 = Math.pow(yOfDart, 2);

        if (x2+y2 <= Math.pow(innerRadius, 2)) {
            return 10;
        } else if (x2+y2 <= Math.pow(middleRadius, 2)) {
            return 5;
        } else if (x2+y2 <= Math.pow(totalRadius, 2)) {
            return 1;
        } else {
            return 0;
        }
    }
}

/*
Calculate the points scored in a single toss of a Darts game.

Darts is a game where players throw darts at a target.

In our particular instance of the game, the target rewards 4 different amounts of points, depending on where the dart lands:

Our dart scoreboard with values from a complete miss to a bullseye

    If the dart lands outside the target, player earns no points (0 points).
    If the dart lands in the outer circle of the target, player earns 1 point.
    If the dart lands in the middle circle of the target, player earns 5 points.
    If the dart lands in the inner circle of the target, player earns 10 points.

The outer circle has a radius of 10 units (this is equivalent to the total radius for the entire target), the middle circle a radius of 5 units, and the inner circle a radius of 1. Of course, they are all centered at the same point — that is, the circles are concentric defined by the coordinates (0, 0).

Given a point in the target (defined by its Cartesian coordinates x and y, where x and y are real), calculate the correct score earned by a dart landing at that point.
 */