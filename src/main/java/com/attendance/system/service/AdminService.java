package com.attendance.system.service;

import com.attendance.system.entity.*;
import com.attendance.system.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    // ---------- USERS ----------
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // ---------- STUDENTS ----------
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(String studentId) {
        studentRepository.deleteById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // ---------- TEACHERS ----------
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(String teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    // ---------- SUBJECTS ----------
    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    // ✅ NEW
    public void deleteSubject(String subjectId) {
        subjectRepository.deleteById(subjectId);
    }

    // ---------- ATTENDANCE ----------
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }
}
