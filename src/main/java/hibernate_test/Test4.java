package hibernate_test;


import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            //updated salary for employee where id=1
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(4000);

            //Update salary $1000 for employees whose name Sebastian
           session.createQuery("update Employee set salary=1000 "+
                   "where firstName='Sebastian'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");


        } finally {


            factory.close();

        }

    }
}