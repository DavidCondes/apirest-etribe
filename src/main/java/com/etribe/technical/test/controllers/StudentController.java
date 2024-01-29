package com.etribe.technical.test.controllers;


import com.etribe.technical.test.models.StudentModel;
import com.etribe.technical.test.models.SubjectModel;
import com.etribe.technical.test.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService alumnService;


    @PostMapping("/add-student")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentModel saveStudent(@RequestBody StudentModel alumn){
        return this.alumnService.saveOrUpdate(alumn);
    }

    @GetMapping("/get-all")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<StudentModel> getAllStudents() {
        return alumnService.getAllStudents();
    }

    @GetMapping("/get-by-id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<StudentModel> getStudentById(@RequestParam(name = "id") Long id) {
        return alumnService.getStudentById(id);
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public StudentModel updateStudent(@RequestBody StudentModel alumn){
        return this.alumnService.saveOrUpdate(alumn);
    }

    @GetMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@RequestParam(name = "id") Long id){
        this.alumnService.delete(id);
    }

    @GetMapping("/get-subjects")
    @ResponseStatus(HttpStatus.OK)
    public Set<SubjectModel> getSubjects(@RequestParam(name = "id") Long id){
        return alumnService.getAllSubjects(id);
    }
}
