package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	public StudentService studentService;
        
	@GetMapping("/students")

	public String listStudents(Model m)
	{
		m.addAttribute("student",studentService.getAllStudent());
	return "students";
	}
	@GetMapping("/student/new")
	public String createStudentForm(Model m)
	{
		Student student=new Student();
		m.addAttribute("student",student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student)
	{
		studentService.saveStudent(student);
		return"redirect:/students";
		
	}
	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable int   id,Model m)
	{
		m.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
		
		
	}
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable int  id,@ModelAttribute("student")Student student,Model m )
	{
		//get Student from database by id
		Student existingStudent=studentService.getStudentById(id);
		existingStudent.setAge(student.getAge());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setName(student.getName());
		existingStudent.setId(student.getId());
		studentService.saveStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	

}
