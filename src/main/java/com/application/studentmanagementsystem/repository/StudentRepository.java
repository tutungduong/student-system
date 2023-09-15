package com.application.studentmanagementsystem.repository;

import com.application.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Long> {

}
