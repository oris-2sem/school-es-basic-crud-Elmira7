package ru.itis.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Lesson extends AbstractEntity{

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "timetable_id")
    private Timetable timetable;



}
