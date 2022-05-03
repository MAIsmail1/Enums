package _4_props_and_methods;

public enum Day {
    SUNDAY("Sunday", true),
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true);

    private String day;
    private boolean weekdays;


    Day(String day, boolean weekdays) {
        this.day = day;
        this.weekdays = weekdays;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public boolean isWeekdays() {
        return weekdays;
    }

    public void setWeekdays(boolean weekdays) {
        this.weekdays = weekdays;
    }
}
