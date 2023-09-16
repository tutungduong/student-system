package com.application.studentmanagementsystem.repository;

import com.application.studentmanagementsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
