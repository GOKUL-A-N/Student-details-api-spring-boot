package com.example.Student.Service;

import com.example.Student.Model.StudentModel;
import com.example.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> getAllStudents()
    {
        return studentRepository.findAll();
    }

    public StudentModel getById(String id)
    {
        return studentRepository.findById(id).orElse(null);
    }

    public StudentModel createStudent(StudentModel student)
    {
        return studentRepository.save(student);
    }

    public void deleteStudent(String id)
    {
        studentRepository.deleteById(id);
    }
}
