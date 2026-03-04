package com.attendance.system.repository;

import com.attendance.system.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
    // No custom query needed
}
