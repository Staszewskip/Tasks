package com.crud.tasks.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class TaskDto {
    private Long id;
    private String title;
    private String content;
}
