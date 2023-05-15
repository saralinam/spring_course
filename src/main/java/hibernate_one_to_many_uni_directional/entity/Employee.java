package hibernate_one_to_many_uni_directional.entity;

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

@Column(name = "salary")
private int salary;



//constructor w/o arguments
    public Employee() {
    }

    //constructor with arguments

    public Employee(String firstName, String surName, int salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
    }

    //getter-setter


    //toString()


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
