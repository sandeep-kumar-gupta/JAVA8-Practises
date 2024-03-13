package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Cloneable{

   private static List <Student> studentList;


static {

    studentList = new ArrayList<>();

    Student student1 = new Student();
    student1.setId(1);
    student1.setName("sandeep");
    student1.setGender("male");

    Student student2 = new Student();
    student2.setId(2);
    student2.setName("kumar");
    student2.setGender("male");

    studentList.add(student1);
    studentList.add(student2);
}

    public List<Student> getStudentList() {
            return studentList;
    }

    @Override
    public List<Student> clone() throws CloneNotSupportedException {

        List<Student> dummyStudentList = new ArrayList<>();
        for(Student student : dummyStudentList){
            dummyStudentList.add(student);
        }
        return dummyStudentList;
    }
}
