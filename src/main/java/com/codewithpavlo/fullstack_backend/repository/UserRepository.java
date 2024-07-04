package com.codewithpavlo.fullstack_backend.repository;

import com.codewithpavlo.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//pass user and data type of primary key. long.
public interface UserRepository extends JpaRepository<User, Long> {
}
