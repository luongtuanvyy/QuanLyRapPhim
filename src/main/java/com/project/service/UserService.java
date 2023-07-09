package com.project.service;

import com.project.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> findAll();
}
