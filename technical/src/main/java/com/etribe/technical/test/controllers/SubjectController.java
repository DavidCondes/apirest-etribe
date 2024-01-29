package com.etribe.technical.test.controllers;


import com.etribe.technical.test.models.SubjectModel;
import com.etribe.technical.test.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/materias")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @PostMapping("/add-subject")
    public SubjectModel saveSubject(@RequestBody SubjectModel subject){
        return subjectService.saveOrUpdate(subject);
    }

    @GetMapping("/get-all")
    public ArrayList<SubjectModel> getAllSubjects() {
        return subjectService.getAll();
    }

    @GetMapping("/get-by-id")
    public Optional<SubjectModel> getSubjectId(@RequestParam(name = "id") Long id) {
        return subjectService.getById(id);
    }

    @PostMapping("/update")
    public SubjectModel updateSubject(@RequestBody SubjectModel subject){
        return subjectService.saveOrUpdate(subject);
    }

    @GetMapping("/delete")
    public void deleteSubject(@RequestParam(name = "id") Long id){
        this.subjectService.delete(id);
    }
}
