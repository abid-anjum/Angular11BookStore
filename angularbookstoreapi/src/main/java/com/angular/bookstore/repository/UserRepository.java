package com.angular.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.bookstore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
