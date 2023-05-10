package com.testProject.demo.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponseDto {

    private String name;
    private String phoneNumber;
    private String cardNumber;
    private String address;
    private String barthDay;

    String employee;
    String depart;



}



