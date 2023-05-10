package com.testProject.demo.service;
import com.testProject.demo.common.entity.Role;
import com.testProject.demo.dto.requestDto.RolesRequestDto;
import com.testProject.demo.dto.responseDto.RolesResponseDto;
import com.testProject.demo.repository.RolesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class RolesServiceEmp implements RolesService{
    private final ModelMapper mapperDep;
    private final RolesRepository rolesRepository;


    @Override
    public RolesResponseDto addRole(RolesRequestDto RolesRequestDto) {


        Role Roles = mapperDep.map(RolesRequestDto, Role.class);

        rolesRepository.save(Roles);

        return mapperDep.map(Roles, RolesResponseDto.class);

    }

    @Override
    public RolesResponseDto getRoleByID(int id) {

        Role Roles = rolesRepository.findById(id).get();

        return mapperDep.map(Roles, RolesResponseDto.class);

    }

    @Override
    public List<RolesResponseDto> getAllRole() {

        List<Role> Roless = rolesRepository.findAll();
        List<RolesResponseDto> dtos = Roless
                .stream()
                .map(Roles -> mapperDep.map(Roles, RolesResponseDto.class))
                .collect(Collectors.toList());

        return dtos;
    }

    @Override
    public RolesResponseDto updateRole(RolesRequestDto RolesRequestDto, int id) {

        Optional<Role> gitRoles = rolesRepository.findById(id);

        if (gitRoles.isEmpty()) {

            throw new RuntimeException("the Roles_Id " + id + "not found");
        } else {

            rolesRepository.save(gitRoles.get());
        }


        return mapperDep.map(gitRoles, RolesResponseDto.class);

    }







}
