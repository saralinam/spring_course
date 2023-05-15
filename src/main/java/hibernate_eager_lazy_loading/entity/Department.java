package hibernate_eager_lazy_loading.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String departmentName;
    @Column(name="max_salary")
    private int maxSalary;
    @Column(name="min_salary")
    private int minSalary;

    @OneToMany(cascade = CascadeType.ALL   //by  default it is lazy
            , mappedBy = "department"
    , fetch = FetchType.LAZY)  //mappedBy is only when we use
    //fetch = FetchType.EAGER - get all the information
    //fetch = FetchType.LAZY  - get only necessary information (it has to fetch each time for every request)
    // bidirectional, in other side of the class where we don't use @JoinColum
    private List<Employee> emps;


    //constructor w/o arguments
    public Department() {
    }
    //constructor with arguments

    public Department(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee employee){
        if(emps==null){
            emps = new ArrayList<>();
        }
        emps.add(employee);
        employee.setDepartment(this);
    }

    //getter-setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    //toString()

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}
