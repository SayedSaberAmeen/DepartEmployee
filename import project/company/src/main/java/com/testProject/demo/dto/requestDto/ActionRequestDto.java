package com.testProject.demo.dto.requestDto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class ActionRequestDto {

    private String name_action;
     private String data_Action;
     private String code_Action;

}
