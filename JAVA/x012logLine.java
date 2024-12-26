package JAVA;

public class x012logLine {
    String logLine;

    public x012logLine(String logLine) {
        this.logLine = logLine;
    }

    public x012LogLevel getLogLevel() {
        String[] newString = logLine.split("]");
        String log = newString[0].replace("[", "");
        x012LogLevel line;

        switch (log) {
            case "TRC":
                line = x012LogLevel.TRACE;
                break;
            case "DBG":
                line = x012LogLevel.DEBUG;
                break;
            case "INF":
                line = x012LogLevel.INFO;
                break;
            case "WRN":
                line = x012LogLevel.WARNING;
                break;
            case "ERR":
                line = x012LogLevel.ERROR;
                break;
            case "FTL":
                line = x012LogLevel.FATAL;
                break;
            default:
                line = x012LogLevel.UNKNOWN;
                break;
        }

        return line;
    }

    public String getOutputForShortLog() {
        String[] newString = logLine.split(":");
        String msg = newString[1].trim();
        x012LogLevel log = getLogLevel();
        String end;
        
        switch (log) {
            case TRACE:
                end = "1";
                break;
            case DEBUG:
                end = "2";
                break;
            case INFO:
                end = "4";
                break;
            case WARNING:
                end = "5";
                break;
            case ERROR:
                end = "6";
                break;
            case FATAL:
                end = "42";
                break;
            default:
                end = "0";
                break;
        }

        return end+":"+msg;
    }
}
