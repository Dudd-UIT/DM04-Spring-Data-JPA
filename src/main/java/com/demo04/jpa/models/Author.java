package com.demo04.jpa.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {

    // @Id
    // @GeneratedValue
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "author_id_gen")
    // @SequenceGenerator(name = "author_sequence", sequenceName =
    // "author_sequence", allocationSize = 1)
    // @TableGenerator(name = "author_gen", table = "id_generator", pkColumnName =
    // "id_name", valueColumnName = "id_value", allocationSize = 1)
    // private Integer id;

    @Column(name = "f_name")
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER) // bên bị động
    @JsonIgnore
    private List<Course> courses;
}
