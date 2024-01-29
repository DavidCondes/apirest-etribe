package com.etribe.technical.test.services;

import com.etribe.technical.test.models.StudentModel;
import com.etribe.technical.test.models.SubjectModel;
import com.etribe.technical.test.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentModel saveOrUpdate(StudentModel alumno){ return studentRepository.save(alumno);}

    public ArrayList<StudentModel> getAllStudents(){
        return (ArrayList<StudentModel>) studentRepository.findAll();
    }

    public Optional<StudentModel> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }

    public Set<SubjectModel> getAllSubjects(Long id){
        Optional<StudentModel> optionalStudent =  studentRepository.findById(id);

        if(optionalStudent.isPresent()){
            StudentModel student = optionalStudent.get();
            return student.getMaterias();
        }

        return null;
    }

}
