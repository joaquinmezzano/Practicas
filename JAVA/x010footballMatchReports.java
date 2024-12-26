package JAVA;

public class x010footballMatchReports {
    public static String onField(int shirtNum) {
        String res;
        
        switch (shirtNum) {
            case 1:
                res = "goalie";
                break;
            case 2:
                res = "left back";
                break;
            case 3:
            case 4:
                res = "center back";
                break;
            case 5: 
                res = "right back";
                break;
            case 6:
            case 7:
            case 8:
                res = "midfielder";
                break;
            case 9:
                res = "left wing";
                break;
            case 10:
                res = "striker";
                break;
            case 11:
                res = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
        }

        return res;
    }
}

/*
You are developing a system to help the staff of a football/soccer club's website report on matches. Data is received from various sources and piped into a single stream after being cleaned up:

1. The team only ever plays a 4-3-3 formation and has never agreed with the 1965 change to the rules allowing for substitutions, never mind enlarged squads.

The player descriptions are as follows:

1 -> "goalie"
2 -> "left back"
3 & 4 "center back"
5 -> "right back"
6, 7, & 8 -> "midfielder"
9 -> "left wing"
10 -> "striker"
11 -> "right wing"

Implement the static FootballMatchReports.onField() method to output a player description based on their shirt number.

2. Modify the FootballMatchReports.onField() method to throw an IllegalArgumentException when a shirt number outside the range 1-11 is processed.
 */
