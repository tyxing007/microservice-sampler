package com.soagrowers.todo.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by Ben on 07/08/2015.
 */
public class CreateTodoCommand {

    @TargetAggregateIdentifier
    private final String todoId;
    private final String description;

    public CreateTodoCommand(String todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public String getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }
}