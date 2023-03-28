package com.crud.tasks.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TrelloCardDto {

    private String name;
    private String description;
    private String pos;
    private String listId;
}