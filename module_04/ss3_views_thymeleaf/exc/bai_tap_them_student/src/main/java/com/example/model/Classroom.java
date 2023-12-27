package com.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students;

    public Classroom(Integer id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Classroom() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
