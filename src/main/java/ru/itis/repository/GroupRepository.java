package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.model.Group;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {
}
