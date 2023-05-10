package com.testProject.demo.dto.requestDto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleRequestDto {


    private int Role_id;
    private String roleName;


}