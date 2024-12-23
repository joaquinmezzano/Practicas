package JAVA;

public class x008logLevels {
    public static String message(String logLine) {
        String[] newString = logLine.split(":"); 
            
        return newString[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] newString = logLine.split("]");

        return newString[0].replace("[", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine);
        String mess = message(logLine);
        
        return mess.trim()+" ("+level+")";
    }
}

/*
In this exercise you'll be processing log-lines.

Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".

There are three different log levels:

    INFO
    WARNING
    ERROR

You have three tasks, each of which will take a log line and ask you to do something with it:

1. Implement the (static) LogLevels.message() method to return a log line's message. Any leading or trailing white space should be removed.

2. Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase.

3. mplement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses.
 */