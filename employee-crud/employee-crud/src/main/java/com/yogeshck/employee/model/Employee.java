package com.yogeshck.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {   // for ui
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
