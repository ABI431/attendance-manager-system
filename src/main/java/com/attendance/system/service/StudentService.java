package com.attendance.system.service;

import com.attendance.system.entity.Student;
import com.attendance.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // ✅ REQUIRED by StudentController
    public Student getStudent(String studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }
}
