package hibernate_one_to_one.entity;

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


@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "details_id")
private Detail empDetail;


//constructor w/o args

    public Employee() {
    }


    //constructor with args

    public Employee(String firstName, String surName, String department, int salary) {
        this.firstName = firstName;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String lastName) {
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

    public Detail getEmpDetail() {
        return empDetail;
    }


    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
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
