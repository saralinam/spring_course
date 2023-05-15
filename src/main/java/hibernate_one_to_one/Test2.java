package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

            try {
//               session = factory.getCurrentSession();
//                Employee employee = new Employee("Jordan", "Adam"
//                        , "HR", 2100);
//
//                Detail detail = new Detail("Charlot", "4329875678"
//                        , "jadam.com");
//                employee.setEmpDetail(detail);
//                detail.setEmployee(employee);
//                session.beginTransaction();
//                session.save(employee);
//                session.getTransaction().commit();
//                System.out.println("Done!");






                session = factory.getCurrentSession();

                //get the employee detail's by id=4
//                session.beginTransaction();
//                Detail detail = session.get(Detail.class, 3);
//                System.out.println(detail.getEmployee());
//                session.getTransaction().commit();
//                System.out.println("Done!");


                //delete employee by id=3
//                session.beginTransaction();
//                Employee employee = session.get(Employee.class, 3);
//                session.delete(employee);
//                session.getTransaction().commit();
//                System.out.println("Done!");


                //first cut off the relationship between detail & employee classes then
                //delete employee's details id = 3  details
//                session.beginTransaction();
//                Detail detail = session.get(Detail.class, 3);
//                detail.getEmployee().setEmpDetail(null);
//                session.delete(detail);
//                session.getTransaction().commit();
//                System.out.println("Done!");

            } finally {
                session.close();
                factory.close();

            }

        }
    }
