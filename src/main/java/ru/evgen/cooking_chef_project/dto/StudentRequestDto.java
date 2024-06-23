package ru.evgen.cooking_chef_project.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.evgen.cooking_chef_project.entity.Group;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {
    private Integer id;
    private String surname;
    private Group group;
}
