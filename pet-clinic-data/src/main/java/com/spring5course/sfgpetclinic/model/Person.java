package com.spring5course.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;
}
