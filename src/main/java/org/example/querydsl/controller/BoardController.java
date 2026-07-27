package org.example.querydsl.controller;

import lombok.RequiredArgsConstructor;
import org.example.querydsl.dto.BoardFormDTO;
import org.example.querydsl.entity.Board;
import org.example.querydsl.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class BoardController {
    private final BoardService boardService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("boards", boardService.findAll());
        return "index";
    }

    @PostMapping
    public String create(@ModelAttribute BoardFormDTO dto) {
        System.out.println("board = " + dto);
        boardService.create(dto.toEntity());
        return "redirect:/";
    }
}
