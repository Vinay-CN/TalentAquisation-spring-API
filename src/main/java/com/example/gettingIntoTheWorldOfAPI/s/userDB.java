package com.example.gettingIntoTheWorldOfAPI.s;

public class userDB {
    private String name ;
    private int id;
    private int age ;
    private int phoneNo ;
    private String skills ;
    private String jobRole ;
    private int ctc ;
    private String location ;

    public userDB() {} //default constructor is must

    public userDB(String name, int id, int age, int phoneNo, String skills, String jobRole, int ctc, String location) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNo = phoneNo;
        this.skills = skills;
        this.jobRole = jobRole;
        this.ctc = ctc;
        this.location = location;
    }

    public userDB(String name, int ID, int age, String location) {
        this.name = name;
        this.id = ID;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getSkills() {
        return skills;
    }

    public String getJobRole() {
        return jobRole;
    }

    public int getCTC() {
        return ctc;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "userDB{" +
                "name='" + name + '\'' +
                ", ID=" + id +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", skills='" + skills + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", CTC=" + ctc +
                ", location='" + location + '\'' +
                '}';
    }
}
