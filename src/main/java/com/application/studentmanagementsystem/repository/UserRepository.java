package com.application.studentmanagementsystem.repository;

import com.application.studentmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);

}