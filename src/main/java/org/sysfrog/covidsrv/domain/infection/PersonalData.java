package org.sysfrog.covidsrv.domain.infection;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class PersonalData {
    @JsonProperty("name")
    private String name;

    @JsonProperty("data-of-birth")
    private String dateOfBirth;

    @JsonProperty("mobile-number")
    private String mobileNumber;

    @JsonProperty("city")
    private String city;

    @JsonProperty("street")
    private String street;

    @JsonProperty("type")
    private String type;

    @JsonProperty("zip")
    private String zip;
}
