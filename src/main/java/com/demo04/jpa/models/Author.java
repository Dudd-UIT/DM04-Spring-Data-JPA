package com.demo04.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "author_id_gen")
    // @SequenceGenerator(name = "author_sequence", sequenceName =
    // "author_sequence", allocationSize = 1)
    // @TableGenerator(name = "author_gen", table = "id_generator", pkColumnName =
    // "id_name", valueColumnName = "id_value", allocationSize = 1)
    private Integer id;

    @Column(name = "f_name")
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;
}
