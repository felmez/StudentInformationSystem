package com.company;

public class Student {
    String name, number;
    int grade;
    Course math;
    Course physics;
    Course chemistry;
    double averageNote;
    boolean isPass;


    Student(String name, int grade, String number, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.grade = grade;
        this.number = number;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mathExamNote, int mathVerbalNote, int physicsExamNote, int physicsVerbalNote, int chemistryExamNote, int chemistryVerbalNote) {

        if (mathExamNote >= 0 && mathExamNote <= 100) {
            this.math.examNote = mathExamNote;
        }

        if (mathVerbalNote >= 0 && mathVerbalNote <= 100) {
            this.math.verbalNote = mathVerbalNote;
        }

        if (physicsExamNote >= 0 && physicsExamNote <= 100) {
            this.physics.examNote = physicsExamNote;
        }

        if (physicsVerbalNote >= 0 && physicsVerbalNote <= 100) {
            this.physics.verbalNote = physicsVerbalNote;
        }

        if (chemistryExamNote >= 0 && chemistryExamNote <= 100) {
            this.chemistry.examNote = chemistryExamNote;
        }

        if (chemistryVerbalNote >= 0 && chemistryVerbalNote <= 100) {
            this.chemistry.verbalNote = chemistryVerbalNote;
        }

    }

    public void isPass() {
        if (this.math.examNote == 0 || this.physics.examNote == 0 || this.chemistry.examNote == 0 || this.math.verbalNote == 0 || this.physics.verbalNote == 0 || this.chemistry.verbalNote == 0) {
            System.out.println("Wrong note entry.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Your GPA: " + String.format("%.2f", this.averageNote));
            if (this.isPass) {
                System.out.println("Grade Passed.");
            } else {
                System.out.println("Grade Failed.");
            }
        }
    }

    public void calculateAverage() {
        this.math.finalNote = (this.math.examNote * 0.70) + (this.math.verbalNote * 0.30);
        this.physics.finalNote = (this.physics.examNote * 0.80) + (this.physics.verbalNote * 0.20);
        this.chemistry.finalNote = (this.chemistry.examNote * 0.90) + (this.chemistry.verbalNote * 0.10);
        this.averageNote = (this.math.finalNote + this.physics.finalNote + this.chemistry.finalNote) / 3.0;
    }

    public boolean isCheckPass() {
        calculateAverage();
        return this.averageNote > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.println("Mathematics Note: " + this.math.finalNote);
        System.out.println("Physics Note: " + this.physics.finalNote);
        System.out.println("Chemistry Note: " + this.chemistry.finalNote);
    }

}