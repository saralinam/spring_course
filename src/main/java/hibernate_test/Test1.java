package hibernate_test;


import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

//        try {
//            Session session = factory.openSession();
//            Employee emp = new Employee("Helen", "Kamaya", "Sales", 1500);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//            session.close();
//        } finally {


            try {
                Session session = factory.openSession();
                Employee emp = new Employee("Leyla", "Migel", "IT", 1600);
                session.beginTransaction();
                session.save(emp);
                session.getTransaction().commit();
                session.close();

                System.out.println(emp);
            } finally {

                factory.close();

            }

        }
    }
//}