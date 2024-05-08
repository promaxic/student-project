package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person{
    private String passpottSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String univercity;
    private String studentId;

    public String getPasspottSeria() {
        return passpottSeria;
    }

    public void setPasspottSeria(String passpottSeria) {
        this.passpottSeria = passpottSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
