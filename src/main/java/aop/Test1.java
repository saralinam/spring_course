package aop;

import aop.aspects.Book;
import aop.aspects.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);


        universityLibrary.getBook();
        universityLibrary.addBook("Sara", book);
        universityLibrary.addMagazine();

//        universityLibrary.returnMagazine();
//        universityLibrary.addBook();

//        universityLibrary.returnBook();


//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
