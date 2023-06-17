package com.dgmf.lombokwithspringboot.entity;

import lombok.*;

@Data // Lombok annotation => Equivalent to : @Setter, @Getter,
// @AllArgsConstructor and @EqualsAndHashCode
public class Student {
    private Long id;
    private String lastName;
    private String firstName;
}
