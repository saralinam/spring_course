package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Sara Lina", 4, 98.50);
        Student student2 = new Student("Mya Lee", 3, 90.23);
        Student student3 = new Student("John Wheelhouse", 2, 92.76);


        students.add(student1);
        students.add(student2);
        students.add(student3);

    }
    public  List<Student>getStudents(){
        System.out.println("Beginning of the method  getStudents");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }

}
