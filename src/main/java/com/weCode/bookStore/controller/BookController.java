package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("api/v1/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto books = BookDto.builder().title("My First Book")
        .build();
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(books);
        return ResponseEntity.ok(bookList);
    }
}
