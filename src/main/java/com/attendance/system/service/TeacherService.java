package com.attendance.system.service;

import com.attendance.system.entity.Subject;
import com.attendance.system.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private SubjectRepository subjectRepository;

    // ✅ Return ALL subjects
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
