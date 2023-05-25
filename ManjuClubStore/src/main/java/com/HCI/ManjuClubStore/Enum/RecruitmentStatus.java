package com.HCI.ManjuClubStore.Enum;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RecruitmentStatus {
    @JsonProperty("always")
    ALWAYS,
    @JsonProperty("recruiting")
    RECRUITING,
    @JsonProperty("completed")
    COMPLETED
}
