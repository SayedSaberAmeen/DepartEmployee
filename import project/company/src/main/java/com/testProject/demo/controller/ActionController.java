package com.testProject.demo.controller;

import com.testProject.demo.dto.requestDto.ActionRequestDto;
import com.testProject.demo.dto.responseDto.ActionResponseDto;
import com.testProject.demo.dto.responseDto.ResponseRoleAndAction;
import com.testProject.demo.service.ActionServiceEmp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/action")
@RequiredArgsConstructor
public class ActionController {

    private final ActionServiceEmp actionServiceEmp;



    @PostMapping("/addAction/{role_id}")
    public ResponseRoleAndAction addAction(@RequestBody ActionRequestDto ActionRequestDto,
                                           @PathVariable(name = "role_id") int depart_id) {

        return actionServiceEmp.addAction(ActionRequestDto, depart_id);

    }

    @GetMapping("/getActionByID/{id}")
    public ActionResponseDto getActionByID(@PathVariable(value = "id") int id) {

        return actionServiceEmp.getActionByID(id);

    }

    @GetMapping("/getAllAction")
    public List<ActionResponseDto> getAllAction() {

        return actionServiceEmp.getAllAction();

    }

    @PostMapping("/updateAction/{id}")
    public ActionResponseDto updateAction(@RequestBody ActionRequestDto ActionRequestDto,
                                         @PathVariable(name = "id") int id) {

        return actionServiceEmp.updateAction(ActionRequestDto, id);

    }


}
