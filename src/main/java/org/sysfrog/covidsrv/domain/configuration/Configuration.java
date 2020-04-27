package org.sysfrog.covidsrv.domain.configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Configuration {
    public Configuration(
            final int warnBeforeSymptoms,
            final int redWarningQuarantine,
            final int yellowWarningQuarantine,
            final int selfDiagnosedQuarantine,
            final Map<String, List<Question>> diagnosticQuestionnaire,
            final Map<String, Map<Status, Page>> pageList
    ) {
        this.warnBeforeSymptoms = warnBeforeSymptoms;
        this.redWarningQuarantine = redWarningQuarantine;
        this.yellowWarningQuarantine = yellowWarningQuarantine;
        this.selfDiagnosedQuarantine = selfDiagnosedQuarantine;
        this.diagnosticQuestionnaire = diagnosticQuestionnaire;
        this.pageList = pageList;
    }

    @JsonProperty("warn_before_symptoms")
    private final int warnBeforeSymptoms;

    @JsonProperty("red_warning_quarantine")
    private final int redWarningQuarantine;

    @JsonProperty("yellow_warning_quarantine")
    private final int yellowWarningQuarantine;

    @JsonProperty("self_diagnosed_quarantine")
    private final int selfDiagnosedQuarantine;

    @JsonProperty("diagnostic_questionnaire")
    private final Map<String, List<Question>> diagnosticQuestionnaire;

    @JsonProperty("page_list")
    private final Map<String, Map<Status, Page>> pageList;
}
