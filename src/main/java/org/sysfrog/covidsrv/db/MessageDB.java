package org.sysfrog.covidsrv.db;

import org.sysfrog.covidsrv.domain.infection.InfectionInfo;
import org.sysfrog.covidsrv.domain.infection.InfectionMessage;
import org.sysfrog.covidsrv.domain.infection.InfectionMessageResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageDB {
    private final Map<String, List<InfectionMessageResponse>> messages = new HashMap<>();
    private int messageCounter = 0;

    private void addMessage(final String prefix, final String message) {
        List<InfectionMessageResponse> messageList = messages.computeIfAbsent(prefix, k -> new ArrayList<>());
        messageList.add(new InfectionMessageResponse(messageCounter++, message));
    }

    public synchronized void addInfection(final InfectionInfo infectionInfo) {
        final List<InfectionMessage> infectionMessages = infectionInfo.getInfectionMessages();
        for (final InfectionMessage infectionMessage : infectionMessages) {
            addMessage(infectionMessage.getAddressPrefix(), infectionMessage.getMessage());
        }
    }

    public synchronized List<InfectionMessageResponse> getMessages(final String prefix) {
        return messages.getOrDefault(prefix, new ArrayList<>());
    }
}
