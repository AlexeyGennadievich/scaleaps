package ru.evgen.cooking_chef_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.evgen.cooking_chef_project.entity.Group;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponsDto {
    private Integer id;
    private String surname;
    private Group group;
}
