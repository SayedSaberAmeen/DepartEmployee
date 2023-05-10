package com.testProject.demo.dto.responseDto;

import lombok.Data;

@Data
public class ResponseRoleAndAction {

    private ActionResponseDto actionResponseDto;
    private  RolesResponseDto rolesResponseDto ;


    public ResponseRoleAndAction(RolesResponseDto rolesResponseDto, ActionResponseDto actionResponseDto) {
        this.actionResponseDto = actionResponseDto;
        this.rolesResponseDto = rolesResponseDto;
    }
}
