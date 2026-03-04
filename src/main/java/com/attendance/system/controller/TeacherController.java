package com.attendance.system.controller;

import com.attendance.system.entity.Attendance;
import com.attendance.system.entity.Subject;
import com.attendance.system.service.AttendanceService;
import com.attendance.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private TeacherService teacherService;

    // 📚 View ALL subjects (NO teacher-subject linking)
    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return teacherService.getAllSubjects();
    }

    // 📝 Mark attendance
    @PostMapping("/mark-attendance")
    public Attendance markAttendance(@RequestBody Attendance attendance) {
        return attendanceService.markAttendance(attendance);
    }
}
