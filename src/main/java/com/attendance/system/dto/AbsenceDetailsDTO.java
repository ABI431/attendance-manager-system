package com.attendance.system.dto;

import java.time.LocalDate;

public class AbsenceDetailsDTO {

    private LocalDate date;
    private String subjectName;
    private long periodsAbsent;

    // computed in service
    private String day;

    public AbsenceDetailsDTO(LocalDate date, String subjectName, long periodsAbsent) {
        this.date = date;
        this.subjectName = subjectName;
        this.periodsAbsent = periodsAbsent;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public long getPeriodsAbsent() {
        return periodsAbsent;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
