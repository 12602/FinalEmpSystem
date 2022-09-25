package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}
	@Override
	public Student updateStudent(Student student) {
		studentRepo.save(student);
		return student;
	}
	@Override
	public Student getStudentById(int   id) 
	{
		
	//	return studentService.getStudentById(id);
	return studentRepo.findById(id).get();
	}
	@Override
	public void  deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

}
