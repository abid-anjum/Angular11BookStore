package com.angular.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.bookstore.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}