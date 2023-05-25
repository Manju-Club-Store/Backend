package com.HCI.ManjuClubStore.Enum;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Affiliation {
    @JsonProperty("central")
    CENTRAL,
    @JsonProperty("college")
    COLLEGE,
    @JsonProperty("department")
    DEPARTMENT
}