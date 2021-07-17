package com.abc.Jackson_Programming;

public class Student {
    private  int id;
    private String name;
    private String school;
    private String address;

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getSchool ( ) {
        return school;
    }

    public void setSchool ( String school ) {
        this.school = school;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public Student ( int id, String name, String school, String address ) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.address = address;
    }

    public Student ( ) {
    }

    @Override
    public String toString ( ) {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
