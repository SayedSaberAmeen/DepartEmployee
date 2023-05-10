package com.testProject.demo.service;

import com.testProject.demo.dto.requestDto.EmployeeRequestDto;
import com.testProject.demo.dto.requestDto.RolesRequestDto;
import com.testProject.demo.dto.responseDto.RolesResponseDto;

import java.util.List;

public interface RolesService {
    public RolesResponseDto addRole(RolesRequestDto roleRequestDto);
    public RolesResponseDto getRoleByID(int id);
    public List<RolesResponseDto> getAllRole();
    public RolesResponseDto updateRole(RolesRequestDto roleRequestDto, int id);

}
