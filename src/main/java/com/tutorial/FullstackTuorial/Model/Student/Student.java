package com.tutorial.FullstackTuorial.Model.Student;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student {
    private long id;
    private String name;
    private String email;
    private Gender gender;

}
