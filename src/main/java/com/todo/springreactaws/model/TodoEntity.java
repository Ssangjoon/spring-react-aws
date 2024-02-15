package com.todo.springreactaws.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TodoEntity {
    private String id;
    private String userId;
    private String title;
    private boolean done;
}
