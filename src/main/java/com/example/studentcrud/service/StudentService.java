package com.example.studentcrud.service;

import com.example.studentcrud.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void saveStudent(Student student);
    void deleteStudent(Long id);
//    void updateStudent(Student student);
}
