package Hibernate_ManyToMany;

import Hibernate_ManyToMany.entity.Child;
import Hibernate_ManyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{

            //Add children to football section
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Sammy", 5);
//            Child child2 = new Child("Liana", 3);
//            Child child3= new Child("Carina", 8);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            //****************************************************************

//            session = factory.getCurrentSession();
//            Section section1 = new Section("swimming");
//            Section section2 = new Section("Chemistry");
//            Section section3 = new Section("Dance");
//
//            Child child1= new Child("Leila", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            //****************************************************************

            //fetch the information using section id =1
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 2);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");


            //fetch the information using child's name

            session = factory.getCurrentSession();

            session.beginTransaction();
            Child child= session.get(Child.class, 2);


            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }
        finally {
            session.close();
            factory.close();
        }
        }
    }
