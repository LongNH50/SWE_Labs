package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        Student s1 = new Student("110001", "Dave", LocalDate.parse("11/18/1951", formatter));
        Student s2 = new Student("110002", "Anna", LocalDate.parse("12/07/1990", formatter));
        Student s3 = new Student("110003", "Erica", LocalDate.parse("01/31/1974", formatter));
        Student s4 = new Student("110004", "Carlos", LocalDate.parse("08/22/2009", formatter));
        Student s5 = new Student("110005", "Bob", LocalDate.parse("03/05/1990", formatter));

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        printListOfStudents(students);

        System.out.println("----------------");
        getListOfPlatinumAlumniStudents(students);

    }

    static void printListOfStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            } else
                break;
        }
    }

    static void getListOfPlatinumAlumniStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (LocalDate.now().getYear() - students[i].getDateOfAdmission().getYear() >= 30) {
                    System.out.println(students[i]);
                }
            } else break;
        }
    }
}