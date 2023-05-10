package com.testProject.demo.service;

import com.testProject.demo.common.entity.Role;
import com.testProject.demo.common.entity.Action;
import com.testProject.demo.dto.requestDto.ActionRequestDto;
import com.testProject.demo.dto.responseDto.ActionResponseDto;
import com.testProject.demo.dto.responseDto.ResponseRoleAndAction;
import com.testProject.demo.dto.responseDto.RolesResponseDto;
import com.testProject.demo.repository.RolesRepository;
import com.testProject.demo.repository.ActionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.testProject.demo.common.util.UtilMessage.endMessage;
import static com.testProject.demo.common.util.UtilMessage.startMessage;
import static com.testProject.demo.common.util.utilTime.end;
import static com.testProject.demo.common.util.utilTime.start;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActionServiceEmp implements ActionService{

    private final ModelMapper mapperAction;
    private final ActionRepository actionRepository;
    private final RolesRepository rolesRepository;


    @Override
    public ResponseRoleAndAction addAction(ActionRequestDto actionRequestDto, int action_id) {

        Long start1 = start;

        String methodName = "addAction";

        log.info(startMessage, methodName);

        Action opjAction = mapperAction.map(actionRequestDto, Action.class);

        Role role = rolesRepository.findById(action_id).get();

        opjAction.setRole(role);

        actionRepository.save(opjAction);
        RolesResponseDto rolesResponseDto = mapperAction.map(role, RolesResponseDto.class);

        ActionResponseDto actionResponseDto = mapperAction.
                map(actionRequestDto, ActionResponseDto.class);

        Long end1 = end;

        log.info(endMessage, methodName, end - start);

        return new ResponseRoleAndAction(rolesResponseDto,actionResponseDto);

    }

    @Override
    public ActionResponseDto getActionByID(int id) {

        Action action = actionRepository.findById(id).get();

        return mapperAction.map(action, ActionResponseDto.class);

    }

    @Override
    public List<ActionResponseDto> getAllAction() {

        List<Action> actionList = actionRepository.findAll();

        List<ActionResponseDto> dtos = actionList
                .stream()
                .map(action -> mapperAction.map(action, ActionResponseDto.class))
                .collect(Collectors.toList());

        return dtos;

    }

    @Override
    public ActionResponseDto updateAction(ActionRequestDto actionRequestDto, int id) {

        Optional<Action> gitAction = actionRepository.findById(id);

        if (gitAction.isEmpty()) {

            throw new RuntimeException("the Action_Id " + id + "not found");

        } else {

            actionRepository.save(gitAction.get());
        }

        return mapperAction.map(gitAction, ActionResponseDto.class);

    }
}
