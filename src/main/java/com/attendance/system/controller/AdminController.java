package com.attendance.system.controller;

import com.attendance.system.entity.*;
import com.attendance.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // ---------- USERS ----------
    @PostMapping("/add-user")
    public User addUser(@RequestBody User user) {
        return adminService.addUser(user);
    }

    // ---------- STUDENTS ----------
    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student) {
        return adminService.addStudent(student);
    }

    @DeleteMapping("/delete-student/{id}")
    public void deleteStudent(@PathVariable String id) {
        adminService.deleteStudent(id);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return adminService.getAllStudents();
    }

    // ---------- TEACHERS ----------
    @PostMapping("/add-teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return adminService.addTeacher(teacher);
    }

    @DeleteMapping("/delete-teacher/{id}")
    public void deleteTeacher(@PathVariable String id) {
        adminService.deleteTeacher(id);
    }

    @GetMapping("/teachers")
    public List<Teacher> getTeachers() {
        return adminService.getAllTeachers();
    }

    // ---------- SUBJECTS ----------
    @PostMapping("/add-subject")
    public Subject addSubject(@RequestBody Subject subject) {
        return adminService.addSubject(subject);
    }

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return adminService.getAllSubjects();
    }

    // ✅ NEW (SAFE ADDITION)
    @DeleteMapping("/delete-subject/{id}")
    public void deleteSubject(@PathVariable String id) {
        adminService.deleteSubject(id);
    }
}
