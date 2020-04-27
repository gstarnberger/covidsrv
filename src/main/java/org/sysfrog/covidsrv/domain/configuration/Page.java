package org.sysfrog.covidsrv.domain.configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Page {
    public Page(
            final String roofline,
            final String title,
            final String boldText,
            final String longText
    ) {
        this.roofline = roofline;
        this.title = title;
        this.boldText = boldText;
        this.longText = longText;
    }

    @JsonProperty("roofline")
    private final String roofline;

    @JsonProperty("title")
    private final String title;

    @JsonProperty("boldText")
    private final String boldText;

    @JsonProperty("longText")
    private final String longText;
}
