package com.application.suchidetailsservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalTime;

@Entity
@Table(name = "candidate")
public class Candidate {

    private String candidateId;
    private int suchiId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mothersName;
    private String mamkul;
    private int age;
    private Date dob;
    private LocalTime birthTime;
    private int salary;
    private String occupation;
    private String gender;
    private String assetDetails;
    private String expectations;

    public Candidate() {

    }

    public Candidate(String candidateId, int suchiId, String firstName, String middleName, String lastName, String mothersName,
                     String mamkul, int age, Date dob, LocalTime birthTime, int salary, String occupation, String gender, String assetDetails, String expectations) {
        this.candidateId = candidateId;
        this.suchiId = suchiId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mothersName = mothersName;
        this.mamkul = mamkul;
        this.age = age;
        this.dob = dob;
        this.birthTime = birthTime;
        this.salary = salary;
        this.occupation = occupation;
        this.gender = gender;
        this.assetDetails = assetDetails;
        this.expectations = expectations;
    }

    @Id
    @Column(name = "candidate_id", nullable = false)
    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    @Column(name = "suchi_id", nullable = false)
    public int getSuchiId() {
        return suchiId;
    }

    public void setSuchiId(int suchiId) {
        this.suchiId = suchiId;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "middle_name", nullable = false)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "mothers_name", nullable = false)
    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMamkul() {
        return mamkul;
    }

    public void setMamkul(String mamkul) {
        this.mamkul = mamkul;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Column(name = "b_time", nullable = false)
    public LocalTime getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(LocalTime birthTime) {
        this.birthTime = birthTime;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "asset_details")
    public String getAssetDetails() {
        return assetDetails;
    }

    public void setAssetDetails(String assetDetails) {
        this.assetDetails = assetDetails;
    }

    public String getExpectations() {
        return expectations;
    }

    public void setExpectations(String expectations) {
        this.expectations = expectations;
    }
}