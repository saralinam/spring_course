package hibernate_eager_lazy_loading;


import hibernate_eager_lazy_loading.entity.Department;
import hibernate_eager_lazy_loading.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.FetchType;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

            Session session = null;

            try {

                //adding employees to department
                //One to many relationship
//                session = factory.getCurrentSession();
//
//                Department dep = new Department("Sales", 900, 2100);
//                Employee emp1 = new Employee("Migual", "Rodrigus", 1800);
//                Employee emp2 = new Employee("Tina", "Cowman", 950);
//                Employee emp3 = new Employee("Hather", "Humbert", 1200);
//
//                dep.addEmployeeToDepartment(emp1);
//                dep.addEmployeeToDepartment(emp2);
//                dep.addEmployeeToDepartment(emp3);
//
//                session.beginTransaction();
//                session.save(dep);
//                session.getTransaction().commit();
//                System.out.println("Done");

//                System.out.println("*************************************************");

                //fetch = FetchType.LAZY loading
//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                System.out.println("Get department");
//                Department department = session.get(Department.class, 1);
//
//                System.out.println("Show department");
//                System.out.println(department);
//
//                System.out.println("Get employees before ");
//                department.getEmps().get(0);
//
//                session.getTransaction().commit();
//                System.out.println("Show employees of the department");
//                System.out.println(department.getEmps());
//                System.out.println("Done");

              //  fetch = FetchType.EAGER

                session = factory.getCurrentSession();

                session.beginTransaction();
                System.out.println("Get department");
                Department department = session.get(Department.class, 1);

                System.out.println("Show department");
                System.out.println(department);

                session.getTransaction().commit();
                System.out.println("Show employees of the department");
                System.out.println(department.getEmps());
                System.out.println("Done");

//                System.out.println("*************************************************");

                //find employee id=1, & find employee's department

//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Employee employee = session.get(Employee.class, 1);
//                System.out.println(employee);
//                System.out.println(employee.getDepartment());
//                session.getTransaction().commit();
//                System.out.println("Done");

//                System.out.println("*************************************************");

                //delete employee id =1 using department, but we @ManyToOne(cascade = CascadeType.ALL)
                //& when you deleting one employee it will delete employee and department,
                // it means all employee will be deleted
//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Employee employee = session.get(Employee.class, 1);
//               session.delete(employee);
//                session.getTransaction().commit();
//                System.out.println("Done");

//                System.out.println("*************************************************");

    //delete employee id =4 using department, but we
   // @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE }, mappedBy = "department") in Department class,
   // & Employee class   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE })
     //when we deleted employee id=4, department & other employees didn't get deleted, because we changed
     //   from CascadeType.All   to {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE })
//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Employee employee = session.get(Employee.class, 4);
//               session.delete(employee);
//                session.getTransaction().commit();
//                System.out.println("Done");

            } finally {
                session.close();
                factory.close();

            }

        }
    }
//}