package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.dto.TaskDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskMapperTest {
    TaskMapper taskMapper = new TaskMapper();

    @Test
    void shouldMapTask() {
        // Given
        Task task = new Task(1L, "title", "content");
        TaskDto taskDto = new TaskDto(1L, "title", "content");
        // When
        Task resultTask = taskMapper.mapToTask(taskDto);
        TaskDto resultTaskDto = taskMapper.mapToTaskDto(task);
        // Then
        Assertions.assertAll(
                () -> assertEquals(task, resultTask),
                () -> assertEquals(taskDto, resultTaskDto)
                );
    }
}
