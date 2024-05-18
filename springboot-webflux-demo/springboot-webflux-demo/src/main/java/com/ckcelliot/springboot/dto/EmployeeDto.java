package com.ckcelliot.springboot.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
