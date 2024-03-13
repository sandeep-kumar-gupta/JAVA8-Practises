package PrototypeDesignPattern;

import java.util.List;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        StudentDao studentDao = new StudentDao();

        List<Student> allStudent = studentDao.getStudentList();


        List<Student> updateStudentList = studentDao.clone();
        Student student = new Student();
        student.setId(5);
        student.setName("ajit");
        student.setGender("male");
        updateStudentList.add(student);

        System.out.println("original List");
        allStudent.forEach(System.out::println);

        System.out.println("updated List");
        updateStudentList.forEach(System.out::println);




    }
}
