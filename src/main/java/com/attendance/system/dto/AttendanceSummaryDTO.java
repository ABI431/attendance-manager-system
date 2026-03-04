package com.attendance.system.dto;

public class AttendanceSummaryDTO {

    private String subjectId;
    private String subjectName;
    private long conducted;
    private long present;
    private long absent;
    private double percentage;

    public AttendanceSummaryDTO(
            String subjectId,
            String subjectName,
            long conducted,
            long present
    ) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.conducted = conducted;
        this.present = present;
        this.absent = conducted - present;
        this.percentage = conducted == 0 ? 0 : (present * 100.0 / conducted);
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public long getConducted() {
        return conducted;
    }

    public long getPresent() {
        return present;
    }

    public long getAbsent() {
        return absent;
    }

    public double getPercentage() {
        return percentage;
    }
}
