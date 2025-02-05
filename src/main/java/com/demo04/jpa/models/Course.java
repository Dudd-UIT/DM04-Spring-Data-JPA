package com.demo04.jpa.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity {

    private String title;

    private String description;

    @JsonIgnore // Ngăn chặn vòng lặp vô hạn khi trả về JSON.
    @ManyToMany // bên chủ động
    @JoinTable(name = "authors_courses", joinColumns = {
            @JoinColumn(name = "course_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "author_id")
    })
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
