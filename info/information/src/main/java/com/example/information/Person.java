package com.example.information;

public class Person {

    private String  usercode;
    private String username;
    private String department;

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getUsercode() {
        return usercode;
    }

    public String getUsername() {
        return username;
    }

    public String getDepartment() {
        return department;
    }

}
