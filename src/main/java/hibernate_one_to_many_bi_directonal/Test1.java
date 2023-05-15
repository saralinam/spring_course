package hibernate_one_to_many_bi_directonal;


import hibernate_one_to_many_bi_directonal.entity.Department;
import hibernate_one_to_many_bi_directonal.entity.Employee;
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

                //adding employees to department
                //Ont to many relationship
//                session = factory.getCurrentSession();
//                Department dep = new Department("IT", 1000, 4000);
//                Employee emp1 = new Employee("Sara", "Lina", 2500);
//                Employee emp2 = new Employee("Helen", "Smith", 1500);
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
//                Department department = session.get(Department.class, 1);
//                System.out.println(department);
//                System.out.println(department.getEmps());
//                session.getTransaction().commit();
//                System.out.println("Done");


                //find employee id=1, & find employee's department

//                session = factory.getCurrentSession();
//
//                session.beginTransaction();
//                Employee employee = session.get(Employee.class, 1);
//                System.out.println(employee);
//                System.out.println(employee.getDepartment());
//                session.getTransaction().commit();
//                System.out.println("Done");


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


    //delete employee id =4 using department, but we
   // @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE }, mappedBy = "department") in Department class,
   // & Employee class   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE })
     //when we deleted employee id=4, department & other employees didn't get deleted, because we changed
     //   from CascadeType.All   to {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE })
                session = factory.getCurrentSession();

                session.beginTransaction();
                Employee employee = session.get(Employee.class, 4);
               session.delete(employee);
                session.getTransaction().commit();
                System.out.println("Done");

            } finally {
                session.close();
                factory.close();

            }

        }
    }
//}