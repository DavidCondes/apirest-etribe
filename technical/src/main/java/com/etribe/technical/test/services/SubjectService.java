package com.etribe.technical.test.services;

import com.etribe.technical.test.models.SubjectModel;
import com.etribe.technical.test.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public SubjectModel saveOrUpdate(SubjectModel subject){ return subjectRepository.save(subject);}

    public ArrayList<SubjectModel> getAll(){
        return (ArrayList<SubjectModel>) subjectRepository.findAll();
    }

    public Optional<SubjectModel> getById(Long id){
        return subjectRepository.findById(id);
    }

    public void delete(Long id){
        subjectRepository.deleteById(id);
    }
}
