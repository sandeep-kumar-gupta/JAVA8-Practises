package Student_Management_System_using_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {

    static Scanner scanner = new Scanner(System.in);
    //add
    public static Student addStudent(){

        Student student = new Student();
        System.out.println("enter the student id : ");
        student.setSid(scanner.nextInt());
        System.out.println("enter the student name : ");
        student.setName(scanner.next());
        System.out.println("enter the student age : ");
        student.setAge(scanner.nextInt());
        return student;
    }




    //update
public static void updateStudent(List<Student> students){

    System.out.println("please update teh details and enter that id you have previously entered");
    System.out.println("enter the student id : ");
    int sid = scanner.nextInt();
    System.out.println("enter the student name : ");
     String name =scanner.next();
    System.out.println("enter the student age : ");
    int age = scanner.nextInt();

    int count =0;
    for (Student student:students){
        if(sid == student.getSid()){
            break;
        }
        count++;
    }
    students.get(count).setName(name);
    students.get(count).setAge(age);


}

    //view or get
    public static void displayStudent(List<Student> students){
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()){
            System.out.println("Student :"+studentIterator.next().toString());
        }
    }

    //delete
    public static void deleteStudent(List<Student> students, int sid){
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()){
            Student s = studentIterator.next();
            if (s.getSid()==sid){
                studentIterator.remove();
            }
        }
    }
}
