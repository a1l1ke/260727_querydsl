package org.example.querydsl.service;

import lombok.RequiredArgsConstructor;
import org.example.querydsl.entity.Board;
import org.example.querydsl.repository.JPABoardRepository;
import org.example.querydsl.repository.QBoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {
    private final QBoardRepository qBoardRepository;
    private final JPABoardRepository jpaBoardRepository;

    @Transactional
    public void create(Board board) {
        jpaBoardRepository.save(board);
    }

    public List<Board> findAll() {
//        return jpaBoardRepository.findAll();
        return qBoardRepository.findAll();
    }
}
