package org.sysfrog.covidsrv.domain.configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Question {
    public Question(
            final String title,
            final String questionText,
            final List<QuestionAnswer> answers
    ) {
        this.title = title;
        this.questionText = questionText;
        this.answers = answers;
    }

    @JsonProperty("title")
    private final String title;

    @JsonProperty("questionText")
    private final String questionText;

    @JsonProperty("answers")
    private final List<QuestionAnswer> answers;
}
