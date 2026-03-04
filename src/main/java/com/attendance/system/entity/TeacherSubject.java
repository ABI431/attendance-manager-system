package com.attendance.system.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "teacher_subject")
@IdClass(TeacherSubjectId.class)
public class TeacherSubject {

    @Id
    @Column(name = "teacher_id")
    private String teacherId;

    @Id
    @Column(name = "subject_id")
    private String subjectId;

    // getters & setters
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
}
