package com.clifford.groupapp.repository;

import com.clifford.groupapp.model.Message;
import com.clifford.groupapp.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByGroupOrderBySentAtAsc(Group group);
}
