package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.model.Timetable;

import java.util.UUID;

public interface TimetableRepository extends JpaRepository<Timetable, UUID> {

}
