package com.example.Student.Model;
import org.springframework.data.mongodb.core.mapping.Field;

public class Certifications {
    @Field("courseName")
    private String courseName;

    @Field("platform")
    private String platform;

    @Field("certificate")
    private boolean certificate;

    @Field("status")
    private boolean status;

    @Field("mentor")
    private String mentor;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isCertificate() {
        return certificate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Certifications(){}

    public Certifications(String courseName,String platform,boolean certificate,boolean status,String mentor){
        this.certificate = certificate;
        this.courseName = courseName;
        this.platform = platform;
        this.status = status;
        this.mentor = mentor;
    }
}
