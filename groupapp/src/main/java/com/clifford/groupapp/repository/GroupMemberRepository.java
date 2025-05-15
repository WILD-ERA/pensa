package com.clifford.groupapp.repository;

import com.clifford.groupapp.model.GroupMember;
import com.clifford.groupapp.model.Group;
import com.clifford.groupapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {
    List<GroupMember> findByUser(User user);
    List<GroupMember> findByGroup(Group group);
}
