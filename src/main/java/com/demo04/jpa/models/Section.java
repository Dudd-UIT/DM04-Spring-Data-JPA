package com.demo04.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Section {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int sectionOrder;
}
