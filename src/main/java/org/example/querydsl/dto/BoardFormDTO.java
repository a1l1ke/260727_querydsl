package org.example.querydsl.dto;

import org.example.querydsl.entity.Board;

public record BoardFormDTO(String title, String content) {
    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .build();
    }
}
