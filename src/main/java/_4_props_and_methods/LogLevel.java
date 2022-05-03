package _4_props_and_methods;

public enum LogLevel {

    DEBUG("Debug", false),
    INFO("Info", false),
    WARNING("Warning", true);

    private String displayName;
    private boolean sendSMS;

    LogLevel(String displayName, boolean sendSMS){
        this.displayName = displayName;
        this.sendSMS = sendSMS;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isSendSMS() {
        return sendSMS;
    }

    public void setSendSMS(boolean sendSMS) {
        this.sendSMS = sendSMS;
    }
}
