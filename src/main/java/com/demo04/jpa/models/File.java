package com.demo04.jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
// @DiscriminatorValue("F") --> Only with SINGLE TABLE
public class File extends Resource {
    private String type;

}
