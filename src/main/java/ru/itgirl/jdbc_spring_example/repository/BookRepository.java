package ru.itgirl.jdbc_spring_example.repository;

import ru.itgirl.jdbc_spring_example.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookById(Long id); //домашнее задание
}
