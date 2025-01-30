package org.hackathon.controller;


import org.hackathon.model.Student;
import org.hackathon.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public Student markAttendance(@PathVariable Long id) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setPresent(!student.isPresent());
        return studentRepository.save(student);
    }
}
