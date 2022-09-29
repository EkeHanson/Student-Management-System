package com.Student.studentManagement.controller;

import com.Student.studentManagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // Handler method ot handle list student request and return view
   @GetMapping("/student")
    public  String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students.html";
    }
}
