package com.example.introspringboot.service;

import com.example.introspringboot.entity.User;
import com.example.introspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User create(User user){
        return userRepository.save(user);
    }

    public User findOne(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public void deleteOne(Long id) {
        userRepository.deleteById(id);
    }

    public User update(User user) {
        return userRepository.save(user);
    }
}
