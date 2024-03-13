import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Operation {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1l,"sandeep","male","it",50000.0));
        list.add(new Employee(2l,"kumari","female","hr",3000.0));
        list.add(new Employee(4l,"gupta","male","sap",500.0));
        list.add(new Employee(16l,"kiat","female","it",5000.0));
        list.add(new Employee(11l,"jha","male","hr",5032.0));
        list.add(new Employee(111l,"suawn","female","it",52200.0));
        list.add(new Employee(19l,"sdfgh","female","sap",50780.0));

        //print all the department
        list.stream().map(aa-> aa.getDepartment()).distinct().forEach(System.out::println);
        //print the count of working employees in each department
       Map<String,Long> map= list.stream().collect(Collectors.groupingBy(a->a.getDepartment(),Collectors.counting()));
        System.out.println(map);
        //print the average salary of each gender
       Map<String,Double> avg = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
       System.out.println(avg);


    }
}
