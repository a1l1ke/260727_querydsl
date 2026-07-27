package org.example.querydsl.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.querydsl.entity.Board;
import org.example.querydsl.entity.QBoard;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QBoardRepository {
    private final JPAQueryFactory jpaQueryFactory;

    public List<Board> findAll() {
        QBoard board = QBoard.board;
        return jpaQueryFactory.selectFrom(board).fetch();
    }
}
