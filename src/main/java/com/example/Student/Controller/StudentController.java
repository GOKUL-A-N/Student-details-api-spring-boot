package com.example.Student.Controller;

import com.example.Student.Model.StudentModel;
import com.example.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentModel> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getById(@PathVariable String id)
    {
        return studentService.getById(id);
    }

    @PostMapping
    public StudentModel createStudent(@RequestBody StudentModel student)
    {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id)
    {
        studentService.deleteStudent(id);
    }
}
