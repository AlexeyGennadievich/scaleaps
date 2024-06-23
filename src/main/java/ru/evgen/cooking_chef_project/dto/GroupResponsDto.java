package ru.evgen.cooking_chef_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.evgen.cooking_chef_project.entity.Student;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupResponsDto {
    private int id;
    private String number;
    private List<Student> students;
    private int quantity;
}
