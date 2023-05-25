package com.HCI.ManjuClubStore.Enum;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RecruitmentType {
    @JsonProperty("link")
    LINK,
    @JsonProperty("phone")
    PHONE,
    @JsonProperty("custom")
    CUSTOM
}
