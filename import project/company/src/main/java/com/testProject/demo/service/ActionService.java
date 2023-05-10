package com.testProject.demo.service;

import com.testProject.demo.dto.requestDto.ActionRequestDto;
import com.testProject.demo.dto.responseDto.ActionResponseDto;
import com.testProject.demo.dto.responseDto.ResponseRoleAndAction;

import java.util.List;




public interface ActionService {
    public ResponseRoleAndAction addAction(ActionRequestDto actionRequestDto, int id);
    public ActionResponseDto getActionByID(int id);
    public List<ActionResponseDto> getAllAction();
    public ActionResponseDto updateAction(ActionRequestDto actionRequestDto, int id);



}
