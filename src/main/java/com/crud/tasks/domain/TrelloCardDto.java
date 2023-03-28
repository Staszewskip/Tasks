package com.crud.tasks.domain;

import com.crud.tasks.domain.dto.BadgesDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloCardDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("badges")
    private BadgesDto badges;

    @JsonProperty("shortUrl")
    private String shortUrl;

}