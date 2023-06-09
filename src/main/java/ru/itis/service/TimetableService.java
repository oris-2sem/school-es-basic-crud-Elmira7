package ru.itis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.model.Timetable;
import ru.itis.repository.TimetableRepository;

import java.sql.Time;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TimetableService {
    private final TimetableRepository timetableRepository;


    public Timetable getTimetable(UUID id){
        return timetableRepository.findById(id).orElseThrow();
    }

    public List<Timetable> getTimetableList(){
        return timetableRepository.findAll();
    }

    public Timetable updateTimetable(Timetable timetable){
        Timetable timetableRepo = timetableRepository.findById(timetable.getId()).orElseThrow();

        timetable.setRoom(timetable.getRoom());

        return timetableRepository.save(timetable);
    }

    public Timetable createTimetable(Timetable timetable){
        return timetableRepository.save(timetable);
    }

    public void deleteTimetable(UUID uuid){
        Timetable timetable = timetableRepository.findById(uuid).orElseThrow();
        timetableRepository.delete(timetable);
    }
}
