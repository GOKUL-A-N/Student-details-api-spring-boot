package com.example.Student.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Students")
@Data
public class StudentModel {


    @Id
    private String id;

    private String name;

    private int age;

    private String department;

    private Address address;

    private String email;

    private String ph_no;

    private List<Education> educations;

    private List<Certifications> certifications;

    public List<Certifications> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certifications> certifications) {
        this.certifications = certifications;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }



    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }



    public StudentModel() {}

    public StudentModel(String id, String name, Address address,List<Education> educations,List<Certifications> certifications) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.educations = educations;
        this.certifications = certifications;
    }



}

