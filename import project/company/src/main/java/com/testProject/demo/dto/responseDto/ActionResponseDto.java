package com.testProject.demo.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionResponseDto {


    private String name_action;
    private String data_Action;
    private String code_Action;











    }















