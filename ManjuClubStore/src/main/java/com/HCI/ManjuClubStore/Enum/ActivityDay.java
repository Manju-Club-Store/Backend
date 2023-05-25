package com.HCI.ManjuClubStore.Enum;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ActivityDay {
    @JsonProperty("monday")
    MONDAY,
    @JsonProperty("tuesday")
    TUESDAY,
    @JsonProperty("wednesday")
    WEDNESDAY,
    @JsonProperty("thursday")
    THURSDAY,
    @JsonProperty("friday")
    FRIDAY,
    @JsonProperty("saturday")
    SATURDAY,
    @JsonProperty("sunday")
    SUNDAY;
}
