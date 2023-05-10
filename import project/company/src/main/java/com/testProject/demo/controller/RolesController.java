package com.testProject.demo.controller;

import com.testProject.demo.dto.requestDto.RolesRequestDto;
import com.testProject.demo.dto.responseDto.RolesResponseDto;
import com.testProject.demo.service.RolesServiceEmp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Roles")
@RequiredArgsConstructor
public class RolesController {

    private final RolesServiceEmp rolesServiceEmp ;

    @PostMapping("/addRole")
    public RolesResponseDto addRole(@RequestBody RolesRequestDto RolesRequestDto) {
        return  rolesServiceEmp.addRole(RolesRequestDto);
    }

    @GetMapping("getRoleByID/{id}")
    public RolesResponseDto getRoleByID(@PathVariable(name = "id") int id) {
        return rolesServiceEmp.getRoleByID(id);
    }
    @GetMapping("/getAllRole")
    public List<RolesResponseDto> getAllRole() {
        return rolesServiceEmp.getAllRole();
    }

    @PostMapping("/updateRole/{id}")
    public RolesResponseDto updateRole(@RequestBody RolesRequestDto RolesRequestDto,
                                              @PathVariable(name = "id") int id) {
        return rolesServiceEmp.updateRole(RolesRequestDto,id);
    }




}
