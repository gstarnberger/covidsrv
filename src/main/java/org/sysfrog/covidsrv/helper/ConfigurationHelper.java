package org.sysfrog.covidsrv.helper;

import org.sysfrog.covidsrv.domain.configuration.Configuration;
import org.sysfrog.covidsrv.domain.configuration.Page;
import org.sysfrog.covidsrv.domain.configuration.Question;
import org.sysfrog.covidsrv.domain.configuration.QuestionAnswer;
import org.sysfrog.covidsrv.domain.configuration.Status;

import java.util.List;
import java.util.Map;

public class ConfigurationHelper {

    public static Configuration getConfiguration() {
        final Page page = new Page("TEST", "a title", "bold", "long text");
        final QuestionAnswer questionAnswer1 = new QuestionAnswer("selfmonitoring pls", Status.SELFMONITORING);
        final QuestionAnswer questionAnswer2 = new QuestionAnswer("suspicion", Status.SUSPICION);
        final QuestionAnswer questionAnswer3 = new QuestionAnswer("hint", Status.HINT);
        final Question question = new Question(
                "question title",
                "question text",
                List.of(questionAnswer1, questionAnswer2, questionAnswer3)
        );
        final Map<String, List<Question>> diagnosticQuestionaire = Map.of(
                "de", List.of(question),
                "en", List.of(question)
        );
        final Map<String, Map<Status, Page>> pageList = Map.of(
                "de", Map.of(Status.HINT, page, Status.SELFMONITORING, page, Status.SUSPICION, page),
                "en", Map.of(Status.HINT, page, Status.SELFMONITORING, page, Status.SUSPICION, page)
        );
        final Configuration configuration = new Configuration(
                54,
                336,
                168,
                168,
                diagnosticQuestionaire,
                pageList
        );
        return configuration;
    }
}
