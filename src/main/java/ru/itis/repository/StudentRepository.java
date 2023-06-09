package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.model.Student;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
