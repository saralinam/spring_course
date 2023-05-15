package hibernate_test.entity;

import javax.persistence.*;

/*
Entity refers to a Java class that represents a persistent object and is
mapped to a database table. The entity class typically has properties that
map to columns in the database table and is annotated with metadata that
defines the mapping between the entity and the database table.
 */
/*
POJO stands for Plain Old Java Object, and it refers to a Java object that follows a
set of simple conventions for class design and does not rely on any framework-specific code.
 It typically contains private fields with public getter and setter methods, which are used
 to access and modify the data stored in the object.
 */
@Entity
@Table(name ="employees")
public class Employee {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
 @Column(name = "id")
private int id;
@Column(name = "name")
private String firstName;
 @Column(name = "surName")
private String surName;
 @Column(name = "department")
private String department;
@Column(name = "salary")
private int salary;


//constructor w/o args
    public Employee() {
    }

    //constructor with args
    public Employee(String name, String surName, String department, int salary) {
        this.firstName = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    //getter-setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return surName;
    }

    public void setLastName(String lastName) {
        this.surName = surName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    //to String

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
