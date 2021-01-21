package com.alvaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvaro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
