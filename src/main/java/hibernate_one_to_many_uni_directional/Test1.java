package hibernate_one_to_many_uni_directional;


import hibernate_one_to_many_uni_directional.entity.Department;
import hibernate_one_to_many_uni_directional.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

            Session session = null;

            try {

                //adding employees to "HR" department
                //Ont to many relationship
//                session = factory.getCurrentSession();
//                Department dep = new Department("HR", 1000, 3000);
//                Employee emp1 = new Employee("Alex", "Demark", 1500);
//                Employee emp2 = new Employee("James", "Doyan", 1700);
//
//                dep.addEmployeeToDepartment(emp1);
//                dep.addEmployeeToDepartment(emp2);
//
//                session.beginTransaction();
//                session.save(dep);
//                session.getTransaction().commit();
//                System.out.println("Done");


                //by using department id, we are getting employees information
//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Department department = session.get(Department.class, 2);
//                System.out.println(department);
//                System.out.println(department.getEmps());
//                session.getTransaction().commit();
//                System.out.println("Done");


                //find employee id=6, & find employee's department

//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Employee employee = session.get(Employee.class, 6);
//                System.out.println(employee);
//                session.getTransaction().commit();
//                System.out.println("Done");


                //delete employee id =1 using department, but we @ManyToOne(cascade = CascadeType.ALL)
                //& when you are deleting one employee it will delete employee and department,
                // it means all employee will be deleted
//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Department department = session.get(Department.class, 2);
//               session.delete(department);
//                session.getTransaction().commit();
//                System.out.println("Done");


    //delete department id =4

                session = factory.getCurrentSession();

                session.beginTransaction();
                Department department = session.get(Department.class, 3);
                session.delete(department);
                session.getTransaction().commit();
                System.out.println("Done");

            } finally {
                session.close();
                factory.close();

            }

        }
    }
//}