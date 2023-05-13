package com.example.ManjuClubStore.Enum;

public enum ActivityDay {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일"),
    SUNDAY("일요일");

    private final String day;

    ActivityDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
