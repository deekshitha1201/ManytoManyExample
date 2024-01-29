package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Skills;
import com.example.Entity.Student;
import com.example.Repository.SkillsRepository;
import com.example.Repository.StudentRepository;

@RestController
public class StudentCourseController {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private SkillsRepository skillsRepository;
	@PostMapping("/addStudent")
	public Student savestudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	@PostMapping("/addCourse")
	public Skills saveskill(@RequestBody Skills skills) {
		List<Student> students = skills.getStudents();        
		for (Student student : students) {             
			// Set the course for each student            
			student.getCourses().add(course);             
			// Save each student            
			studentRepository.save(student);         }
		}
		return skillsRepository.save(skills);
	}

}
