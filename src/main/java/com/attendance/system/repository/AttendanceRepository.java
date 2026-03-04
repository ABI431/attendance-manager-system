package com.attendance.system.repository;

import com.attendance.system.dto.AbsenceDetailsDTO;
import com.attendance.system.dto.AttendanceSummaryDTO;
import com.attendance.system.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

    // ✅ Attendance Summary
    @Query("""
        SELECT new com.attendance.system.dto.AttendanceSummaryDTO(
            a.subjectId,
            s.subjectName,
            COUNT(a),
            SUM(CASE WHEN a.status = 'Present' THEN 1 ELSE 0 END)
        )
        FROM Attendance a
        JOIN Subject s ON a.subjectId = s.subjectId
        WHERE a.studentId = :studentId
        GROUP BY a.subjectId, s.subjectName
    """)
    List<AttendanceSummaryDTO> getAttendanceSummary(
            @Param("studentId") String studentId
    );

    // ✅ Absence Details (NO DB FUNCTIONS)
    @Query("""
        SELECT new com.attendance.system.dto.AbsenceDetailsDTO(
            a.date,
            s.subjectName,
            COUNT(a)
        )
        FROM Attendance a
        JOIN Subject s ON a.subjectId = s.subjectId
        WHERE a.studentId = :studentId
          AND a.status = 'Absent'
        GROUP BY a.date, s.subjectName
        ORDER BY a.date
    """)
    List<AbsenceDetailsDTO> getAbsenceDetails(
            @Param("studentId") String studentId
    );
}
