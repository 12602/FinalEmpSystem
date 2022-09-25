package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;


@Service
public interface StudentService {
List<Student>getAllStudent();
Student saveStudent(Student student);
Student updateStudent(Student student);
Student getStudentById(int id);
void  deleteStudentById(int id);
}
