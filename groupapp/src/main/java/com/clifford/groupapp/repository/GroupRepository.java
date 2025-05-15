package com.clifford.groupapp.repository;

import com.clifford.groupapp.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
