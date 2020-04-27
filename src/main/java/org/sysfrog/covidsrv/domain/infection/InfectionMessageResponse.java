package org.sysfrog.covidsrv.domain.infection;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class InfectionMessageResponse {
    public InfectionMessageResponse(final int id, final String message) {
        this.id = id;
        this.message = message;
    }

    @JsonProperty("id")
    private final int id;

    @JsonProperty("message")
    private final String message;
}
