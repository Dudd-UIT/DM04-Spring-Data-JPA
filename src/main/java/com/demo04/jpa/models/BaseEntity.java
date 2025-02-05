package com.demo04.jpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder // Cho phép builder pattern hoạt động trong các class kế thừa.
@MappedSuperclass // Xác định class cha (superclass) trong JPA nhưng không phải là một entity
                  // trong database.
public class BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;
}
