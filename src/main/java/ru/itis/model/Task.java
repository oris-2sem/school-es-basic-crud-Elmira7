package ru.itis.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Task extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column
    private String description;

}


