package JAVA;

class x003squeakyClean {
    static String clean(String identifier) {
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < identifier.length(); i++) {
            char elem = identifier.charAt(i);

            if (Character.isWhitespace(elem)) {
                res.append('_');
            } else if (!Character.isLetter(elem) && !Character.isDigit(elem) && elem != '-') {
                continue;
            } else {
                switch(elem) {
                    case '-':
                        i++;
                        res.append(Character.toUpperCase(identifier.charAt(i)));
                        break;
                    case '4':
                        res.append('a');
                        break;
                    case '3':
                        res.append('e');
                        break;
                    case '0':
                        res.append('o');
                        break;
                    case '1':
                        res.append('l');
                        break;
                    case '7':
                        res.append('t');
                        break;
                    default:
                        res.append(identifier.charAt(i));
                        break;
                }
            }
        }

        return res.toString();
    }
}

/*
In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.
In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.
In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.

1. Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores. This also applies to leading and trailing spaces.
2. Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.
3. Modify the (static) SqueakyClean.clean() method to convert leetspeak to normal text.
For simplicity we will only be replacing 4, 3, 0, 1 and 7 with a, e, o, l, and t, respectively.
4. Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.
 */