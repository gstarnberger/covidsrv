package org.sysfrog.covidsrv.domain.tan;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
import java.util.UUID;

@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TanResponse {
    final static private ObjectMapper mapper = new ObjectMapper();

    private final String status = "successful";
    private final UUID uuid = UUID.randomUUID();

    @JsonProperty("httpCode")
    private final int httpCode = 200;

    @JsonProperty("message")
    public String getMessage() throws JsonProcessingException {
        final Map<String, String> messageMap = Map.of("uuid", uuid.toString(), "status", status);
        return mapper.writeValueAsString(messageMap);
    }
}
