package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.model.Task;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {

}
