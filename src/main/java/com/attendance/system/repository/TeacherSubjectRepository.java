package com.attendance.system.repository;

import com.attendance.system.entity.TeacherSubject;
import com.attendance.system.entity.TeacherSubjectId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherSubjectRepository
        extends JpaRepository<TeacherSubject, TeacherSubjectId> {

    List<TeacherSubject> findByTeacherId(String teacherId);
}
