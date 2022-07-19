package com.company.form;

import com.company.entity.Country;

import java.sql.Date;

public class UserDetailForm {

    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Date birthdate;
    private String profileDescription;
    private Integer nationalityId;
    private Integer birthplaceId;
    private String address;

    public UserDetailForm() {
    }

    public UserDetailForm(Integer id, String name, String surname, String email, String phone, Date birthdate, String profileDescription, Integer nationalityId, Integer birthplaceId, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.profileDescription = profileDescription;
        this.nationalityId = nationalityId;
        this.birthplaceId = birthplaceId;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public Integer getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Integer getBirthplaceId() {
        return birthplaceId;
    }

    public void setBirthplaceId(Integer birthplaceId) {
        this.birthplaceId = birthplaceId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}