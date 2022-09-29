package com.Student.studentManagement.service.impl;

import com.Student.studentManagement.entity.Student;
import com.Student.studentManagement.repository.StudentRepository;
import com.Student.studentManagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
