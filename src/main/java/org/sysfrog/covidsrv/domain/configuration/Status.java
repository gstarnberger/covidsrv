package org.sysfrog.covidsrv.domain.configuration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    HINT("hint"),
    SELFMONITORING("SELFMONITORING"),
    SUSPICION("SUSPICION"),
    NEXT("next");

    private final String status;

    Status(final String status) {
        this.status = status;
    }

    @JsonValue
    public String getStatus() {
        return this.status;
    }
}
