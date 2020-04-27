package org.sysfrog.covidsrv.domain.infection;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class InfectionMessage {
    @JsonProperty("message")
    private String message;

    @JsonProperty("addressPrefix")
    private String addressPrefix;

    public String getMessage() {
        return message;
    }

    public String getAddressPrefix() {
        return addressPrefix;
    }
}
