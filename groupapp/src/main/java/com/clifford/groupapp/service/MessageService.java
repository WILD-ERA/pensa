package com.clifford.groupapp.service;

import com.clifford.groupapp.model.Group;
import com.clifford.groupapp.model.Message;
import com.clifford.groupapp.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getMessagesByGroup(Group group) {
        return messageRepository.findByGroupOrderBySentAtAsc(group);
    }
}
