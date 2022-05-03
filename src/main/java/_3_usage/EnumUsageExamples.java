package _3_usage;

import _2_basic.LogLevel;

public class EnumUsageExamples {

    public String getLogLevelsWithSwitchCase(LogLevel logLevel) {

        switch (logLevel) {
            case DEBUG -> {
                return "DEBUG!";
            }
            case INFO -> {
                return "INFO!";
            }
            default -> {
                return "WARNING!";
            }
        }

    }

    String getLogLevelsWithIf(LogLevel logLevel){
        if(logLevel == logLevel.DEBUG){
            return "DEBUG!";
        } else if(logLevel == logLevel.INFO){
            return "INFO!";
        } else if(logLevel == logLevel.WARNING){
            return "WARNING!";
        } else {
            return null;
        }
    }

}
