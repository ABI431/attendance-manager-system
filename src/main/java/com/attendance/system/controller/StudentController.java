package com.attendance.system.controller;

import com.attendance.system.dto.AbsenceDetailsDTO;
import com.attendance.system.dto.AttendanceSummaryDTO;
import com.attendance.system.entity.Student;
import com.attendance.system.service.AttendanceService;
import com.attendance.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}/profile")
    public Student getProfile(@PathVariable String studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping("/{studentId}/attendance-summary")
    public List<AttendanceSummaryDTO> attendanceSummary(
            @PathVariable String studentId) {
        return attendanceService.getAttendanceSummary(studentId);
    }

    @GetMapping("/{studentId}/absence-details")
    public List<AbsenceDetailsDTO> absenceDetails(
            @PathVariable String studentId) {
        return attendanceService.getAbsenceDetails(studentId);
    }
}
