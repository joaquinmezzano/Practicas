import java.util.HashMap;
import java.util.Map;

public class x029resistorColorDuo {
    Map<String, Integer> items = new HashMap<String, Integer>();
    
    int value(String[] colors) {
        initializeMap();
        String res = "";
        
        res += items.get(colors[0]);
        res += items.get(colors[1]);

        return Integer.valueOf(res);
    }

    void initializeMap() {
        items.put("black", 0);
        items.put("brown", 1);
        items.put("red", 2);
        items.put("orange", 3);
        items.put("yellow", 4);
        items.put("green", 5);
        items.put("blue", 6);
        items.put("violet", 7);
        items.put("grey", 8);
        items.put("white", 9);
    }
}

/*
If you want to build something using a Raspberry Pi, you'll probably use resistors. For this exercise, you need to know two things about them:

    Each resistor has a resistance value.
    Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.

To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values. Each band has a position and a numeric value.

The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number. For example, if they printed a brown band (value 1) followed by a green band (value 5), it would translate to the number 15.

In this exercise you are going to create a helpful program so that you don't have to remember the values of the bands. The program will take color names as input and output a two digit number, even if the input is more than two colors!

The band colors are encoded as follows:

    black: 0
    brown: 1
    red: 2
    orange: 3
    yellow: 4
    green: 5
    blue: 6
    violet: 7
    grey: 8
    white: 9

From the example above: brown-green should return 15, and brown-green-violet should return 15 too, ignoring the third color.
 */