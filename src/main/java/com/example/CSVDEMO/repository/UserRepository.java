package com.example.CSVDEMO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CSVDEMO.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}
