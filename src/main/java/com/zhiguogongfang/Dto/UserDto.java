package com.zhiguogongfang.Dto;

public class UserDto {
    private String firstname;
    private String lastName;

    public UserDto(){

    }
    public UserDto(String firstName,String lastName){
        this.firstname=firstName;
        this.lastName=lastName;
    }
    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

