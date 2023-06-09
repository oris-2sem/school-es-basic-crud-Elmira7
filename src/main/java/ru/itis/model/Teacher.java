package ru.itis.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Teacher extends AbstractEntity{

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private List<Timetable> timetables;

}
