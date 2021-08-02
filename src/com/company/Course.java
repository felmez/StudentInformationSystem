package com.company;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote, verbalNote;
    double finalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.examNote = 0;
        this.finalNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Assigning Teacher Done.");
        } else {
            System.out.println(t.name + " Assigning Teacher Can't Be Done.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Course Teacher is: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " Course Teacher is Not Assigned.");
        }
    }
}