package com.example.introspringboot.repository;

import com.example.introspringboot.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
