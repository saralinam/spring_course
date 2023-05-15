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

//            Add children to football section
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Hip-Hope");
//            Child child1 = new Child("Adelina", 7);
//            Child child2 = new Child("Mikaya", 6);
//            Child child3= new Child("Tomas", 8);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
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

            //****************************************************************'


            //fetch the information using child's name

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Child child= session.get(Child.class, 2);
//
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

            //****************************************************************
        // delete section by id=1, it deleted all the student in who take that section
            //because we used  @ManyToMany(cascade = CascadeType.ALL)
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            //****************************************************************


            //delete section dance
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            //****************************************************************

            //remove  child with id=9  from section ballet but section didn't get deleted because we used
            //CasCadeType.DELETE in child & section classes. other children can continue the ballet session.
            // we just removed the child id=9, Makaya
            session = factory.getCurrentSession();

            session.beginTransaction();
           Child child = session.get(Child.class, 9);
           session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!!!");



        }
        finally {
            session.close();
            factory.close();
        }
        }
    }
