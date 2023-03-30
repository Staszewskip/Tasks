package com.crud.tasks.service;

import com.crud.tasks.controller.TaskNotFoundException;
import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.dto.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DbService {
    private final TaskRepository repository;
    private final TaskMapper taskMapper;

    public List<TaskDto> getAllTasks() {
        List<Task> taskList = repository.findAll();
        return taskMapper.mapToTaskDtoList(taskList);
    }
    public TaskDto getTask(final Long taskId) throws TaskNotFoundException {
        Task task = repository.findById(taskId).orElseThrow(TaskNotFoundException::new);
        return taskMapper.mapToTaskDto(task);
    }
    public void saveTask(final TaskDto taskDto) {
        Task task = taskMapper.mapToTask(taskDto);
        repository.save(task);
    }
    public TaskDto updateTask(final TaskDto taskDto) {
        Task task = taskMapper.mapToTask(taskDto);
        repository.save(task);
        return taskMapper.mapToTaskDto(task);
    }
    public void deleteTask(final Long taskId) throws TaskNotFoundException {
        Task task = repository.findById(taskId).orElseThrow(TaskNotFoundException::new);
        repository.delete(task);
    }
}
