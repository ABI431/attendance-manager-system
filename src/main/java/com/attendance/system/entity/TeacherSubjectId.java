package com.attendance.system.entity;

import java.io.Serializable;
import java.util.Objects;

public class TeacherSubjectId implements Serializable {

    private String teacherId;
    private String subjectId;

    public TeacherSubjectId() {}

    public TeacherSubjectId(String teacherId, String subjectId) {
        this.teacherId = teacherId;
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeacherSubjectId)) return false;
        TeacherSubjectId that = (TeacherSubjectId) o;
        return Objects.equals(teacherId, that.teacherId)
                && Objects.equals(subjectId, that.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, subjectId);
    }
}
