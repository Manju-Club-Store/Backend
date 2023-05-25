package com.HCI.ManjuClubStore.Enum;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Category {

    @JsonProperty("music")
    MUSIC,
    @JsonProperty("sports")
    SPORTS,
    @JsonProperty("art")
    ART,
    @JsonProperty("social")
    SOCIAL,
    @JsonProperty("volunteer")
    VOLUNTEER,
    @JsonProperty("academic")
    ACADEMIC,
    @JsonProperty("other")
    OTHER;
}
