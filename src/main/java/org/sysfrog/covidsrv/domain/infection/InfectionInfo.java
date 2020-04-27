package org.sysfrog.covidsrv.domain.infection;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class InfectionInfo {
    @JsonProperty("authorization")
    private int authorization;

    @JsonProperty("infection-messages")
    private List<InfectionMessage> infectionMessages;

    @JsonProperty("personal-data")
    private PersonalData personalData;

    public int getAuthorization() {
        return authorization;
    }

    public List<InfectionMessage> getInfectionMessages() {
        return infectionMessages;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
}
