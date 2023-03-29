package com.crud.tasks.mapper;

import com.crud.tasks.domain.TrelloBoard;
import com.crud.tasks.domain.TrelloCard;
import com.crud.tasks.domain.TrelloList;
import com.crud.tasks.domain.dto.TrelloBoardDto;
import com.crud.tasks.domain.dto.TrelloCardDto;
import com.crud.tasks.domain.dto.TrelloListDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrelloMapperTest {
    TrelloMapper trelloMapper = new TrelloMapper();

    @Test
    void shouldMapTrelloCardsDto() {
        // Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("name", "description", "pos", "listId");
        TrelloCard trelloCard = new TrelloCard("name", "description", "pos", "listId");

        // When
        TrelloCardDto resultTrelloCardDto = trelloMapper.mapToCardDto(trelloCard);
        TrelloCard resultTrelloCard = trelloMapper.mapToCard(trelloCardDto);
        // Then
        assertEquals(trelloCardDto, resultTrelloCardDto);
        assertEquals(trelloCard, resultTrelloCard);
    }

    @Test
    void shouldMapTrelloListDto() {
        // Given
        List<TrelloListDto> trelloListDto = List.of(new TrelloListDto("id", "name", false));
        List<TrelloList> trelloList = List.of(new TrelloList("id", "name", false));

        // When
        List<TrelloListDto> resultTrelloListDto = trelloMapper.mapToListDto(trelloList);
        List<TrelloList> resultTrelloList = trelloMapper.mapToList(trelloListDto);
        // Then
        assertEquals(trelloList, resultTrelloList);
        assertEquals(trelloListDto, resultTrelloListDto);
    }

    @Test
    void shouldMapTrelloBoardDto() {
        // Given
        List<TrelloBoardDto> trelloBoardDto = List.of(new TrelloBoardDto("id", "name", new ArrayList<>()));
        List<TrelloBoard> trelloBoard = List.of(new TrelloBoard("id", "name", new ArrayList<>()));

        // When
        List<TrelloBoardDto> resultTrelloBoardDto = trelloMapper.mapToBoardsDto(trelloBoard);
        List<TrelloBoard> resultTrelloBoard = trelloMapper.mapToBoards(trelloBoardDto);
        // Then
        assertEquals(trelloBoard, resultTrelloBoard);
        assertEquals(trelloBoardDto, resultTrelloBoardDto);
    }
}
