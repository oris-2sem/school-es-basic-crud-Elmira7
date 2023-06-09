package ru.itis.model;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "groups")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Group extends AbstractEntity{

    @Column
    private Integer course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private List<Timetable> timetables;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private List<Student> students;

}
