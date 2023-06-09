package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.model.Parent;

import java.util.UUID;

public interface ParentRepository extends JpaRepository<Parent, UUID> {

}
