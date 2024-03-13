package Student_Management_System_using_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
while (true) {
    if (count != 0){
        System.out.println("if you want to continue the operation then press 'yes' ");
        String continues = scanner.next();
        if (continues.equalsIgnoreCase("yes")){

        }else {
            System.exit(0);
        }
    }
    count++;

    System.out.println("Student Management System Using Collection ");
    System.out.println("============================================");
    System.out.println("1.Add Student\n2.View Student\n3.Update Student\n4.Delete Student\n5.Exit");
    System.out.println(" select the option what do you want ");
    int option = scanner.nextInt();

    switch (option) {

        case 1:
            Student student = StudentUtility.addStudent();
            studentList.add(student);
            System.out.println("student added succesfully");
            break;
            //add student

        case 2: StudentUtility.displayStudent(studentList);
           break;
            //view student


        case 3: StudentUtility.updateStudent(studentList);
            System.out.println("updated successfully");
            break;

            //update student


        case 4:
            System.out.println("delete the student");
            System.out.println("enter the student id");
            int sid = scanner.nextInt();
            StudentUtility.deleteStudent(studentList, sid);
            System.out.println("deleted succesfully");
            break;
            //delete student

        case 5:
            System.exit(0);

        default:
            System.err.println("please enter the correct option:");


    }


}
    }

}