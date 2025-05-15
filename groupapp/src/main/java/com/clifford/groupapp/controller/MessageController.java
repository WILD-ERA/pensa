package com.clifford.groupapp.controller;

import com.clifford.groupapp.model.Group;
import com.clifford.groupapp.model.Message;
import com.clifford.groupapp.service.GroupService;
import com.clifford.groupapp.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;
    private final GroupService groupService;

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("/group/{groupId}")
    public List<Message> getMessagesByGroup(@PathVariable Long groupId) {
        Optional<Group> group = groupService.getGroupById(groupId);
        return group.map(messageService::getMessagesByGroup).orElse(List.of());
    }
}
