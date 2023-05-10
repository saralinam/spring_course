package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main started");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary library = context.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = library.returnBook();
        System.out.println("The book returned to the library" + bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
