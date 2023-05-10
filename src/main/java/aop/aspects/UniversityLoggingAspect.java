package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "logging the student list before the getStudents method ");
//    }




//    @AfterReturning(pointcut = "execution(* getStudents())",  // added name pointcut & showed return "students"
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String fullName = firstStudent.getFullName();
//        fullName = "Ms. " + fullName;
//        firstStudent.setFullName(fullName);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "logging the student list after the getStudents method ");
//    }


    //Advice types @AfterThrowing

//    @AfterThrowing("execution(* getStudents())")
//    public void afterThrowingGetStudentsLoggingAdvice(){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: "+
//                "Logging the Throw Exception");
//    }


    //adding pointcut & second parameter 'throwing ="exception "'
//    @AfterThrowing(pointcut="execution(* getStudents())"
//    ,throwing= "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//
//
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: "+
//                "Logging the Throw Exception" + exception);
//    }


    //@After advice type

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: " +
                "logging end of the method or throw an exception");
    }





}
