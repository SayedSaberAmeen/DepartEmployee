package com.testProject.demo.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionResponseDto {


    private String name_action;
    private String dataAction;
    private String codAction;


    String action;
    String role;














}
