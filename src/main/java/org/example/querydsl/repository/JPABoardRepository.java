package org.example.querydsl.repository;

import org.example.querydsl.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPABoardRepository extends JpaRepository<Board, Long> {
}
