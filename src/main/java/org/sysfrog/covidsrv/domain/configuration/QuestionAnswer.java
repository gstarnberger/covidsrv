package org.sysfrog.covidsrv.domain.configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class QuestionAnswer {
    public QuestionAnswer(
            final String text,
            final Status decision
    ) {
        this.text = text;
        this.decision = decision;
    }

    @JsonProperty("text")
    private final String text;

    @JsonProperty("decission")
    private final Status decision;
}
