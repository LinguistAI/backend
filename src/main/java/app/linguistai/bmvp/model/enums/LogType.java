package app.linguistai.bmvp.model.enums;

public enum LogType {
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");

    private String logType;

    LogType(String logType) {
        this.logType = logType;
    }

    public String getLogType() {
        return this.logType;
    }
}
