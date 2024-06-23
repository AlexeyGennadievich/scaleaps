package ru.evgen.cooking_chef_project.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.evgen.cooking_chef_project.dto.for_group.GroupRequestDto;
import ru.evgen.cooking_chef_project.dto.for_group.GroupResponsDto;
import ru.evgen.cooking_chef_project.mapping.GroupMapper;
import ru.evgen.cooking_chef_project.service.GroupService;

import java.util.List;

@RestController
@Tag(name = "Group controller",
        description = "Все методы для работы с группами университета")
@RequestMapping(path = "/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;


    @Operation(summary = "Добавление новой группы университета")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addGroup(@RequestBody GroupRequestDto addGroupRequestDto){
        groupService.addGroup(addGroupRequestDto);
    }

    @Operation(summary = "Получить информацию о всех группах")
    @GetMapping
    public List<GroupResponsDto> getAllGroup(){
       return groupService.getAllGroup();
    }

    @Operation(summary = "Получить информацию по одной группе")
    @GetMapping("/{id}")
    public GroupResponsDto getOneGroup(@Parameter(description = "Id идентификатор группы студентов")
                                           @PathVariable long id){
        return groupService.getOneGroup(id);
    }

}
