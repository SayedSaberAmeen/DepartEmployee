package com.testProject.demo.dto.responseDto;

import com.testProject.demo.dto.responseDto.ActionResponseDto;
import com.testProject.demo.dto.responseDto.RolesResponseDto;
import lombok.Data;

@Data
public class ResponseDeportAndEmployee {

    private DepartmentResponseDto departmentResponseDto;
    private EmployeeResponseDto employeeResponseDto ;

    public ResponseDeportAndEmployee(DepartmentResponseDto departmentResponseDto, EmployeeResponseDto employeeResponseDto) {
        this.departmentResponseDto = departmentResponseDto;
        this.employeeResponseDto = employeeResponseDto;
    }
}
