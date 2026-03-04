package com.attendance.system.service;

import com.attendance.system.dto.AbsenceDetailsDTO;
import com.attendance.system.dto.AttendanceSummaryDTO;
import com.attendance.system.entity.Attendance;
import com.attendance.system.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    // teacher
    public Attendance markAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    // student summary
    public List<AttendanceSummaryDTO> getAttendanceSummary(String studentId) {
        return attendanceRepository.getAttendanceSummary(studentId);
    }

    // ✅ absence details
    public List<AbsenceDetailsDTO> getAbsenceDetails(String studentId) {

        List<AbsenceDetailsDTO> list =
                attendanceRepository.getAbsenceDetails(studentId);

        // compute day name safely in Java
        for (AbsenceDetailsDTO d : list) {
            String day = d.getDate()
                    .getDayOfWeek()
                    .getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            d.setDay(day);
        }

        return list;
    }
}
