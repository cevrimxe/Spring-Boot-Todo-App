package com.example.spring_boot_todo_applicationx.services;

import com.example.spring_boot_todo_applicationx.models.TodoItem;
import com.example.spring_boot_todo_applicationx.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }

    public Iterable<TodoItem> getAll() {
        return todoItemRepository.findAll();
    }

    public TodoItem save(TodoItem todoItem) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(ZoneId.systemDefault());
        if (todoItem.getId() == null) {
            todoItem.setCreatedAt(formatter.format(Instant.now()));
        }
        todoItem.setUpdatedAt(formatter.format(Instant.now()));
        return todoItemRepository.save(todoItem);
    }


    public void delete(TodoItem todoItem) {
        todoItemRepository.delete(todoItem);
    }

}