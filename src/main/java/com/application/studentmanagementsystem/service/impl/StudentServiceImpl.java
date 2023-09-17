package com.application.studentmanagementsystem.service.impl;

import com.application.studentmanagementsystem.dto.StudentDto;
import com.application.studentmanagementsystem.entity.Student;
import com.application.studentmanagementsystem.mapper.StudentMapper;
import com.application.studentmanagementsystem.repository.StudentRepository;
import com.application.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
       List<Student> students = studentRepository.findAll();
       List<StudentDto> studentDtos =students.stream()
               .map((student) -> StudentMapper.mapToStudentDto(student))
               .collect(Collectors.toList());
       return studentDtos;
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student =StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.mapToStudent(studentDto));
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
