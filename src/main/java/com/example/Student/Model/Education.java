package com.example.Student.Model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Education {

    @Field("degree")
    private String degree;

    @Field("institution")
    private String institution;

    @Field("graduationYear")
    private int graduationYear;

    // Constructors
    public Education() {}

    public Education(String degree, String institution, int graduationYear) {
        this.degree = degree;
        this.institution = institution;
        this.graduationYear = graduationYear;
    }

    // Getters and Setters
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
