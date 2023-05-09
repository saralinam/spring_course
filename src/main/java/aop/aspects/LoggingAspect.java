package aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
//@Aspect annotation is allows us to define classes  as aspects and apply them to
//specific join points in the application using advice methods
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
//    private void allMethodsFromUniversityLibrary(){
//    }
//
//    @Pointcut("execution(public void aop.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniversityLibrary(){
//    }
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniversityLibrary(){
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice:  Log #10 ");
//    }






//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniversityLibrary(){
//    }
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniversityLibrary(){
//
//    }
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()")
//    private void allGetAndReturnMethodsFromUniversityLibrary(){
//    }
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice:  writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    public void allReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice:  writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice:  writing Log #3");
//    }







    @Before("aop.aspects.MyPointcuts.allAddMethods()") // inside ("execution(public void getBook())") called pointcut
    public void beforeGetBookLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
        System.out.println(" methodSignature=  " + methodSignature);
        System.out.println(" methodSignature.getMethod()=  " + methodSignature.getMethod());
        System.out.println(" methodSignature.getReturnType()=  " + methodSignature.getReturnType());
        System.out.println(" methodSignature.getName()=  " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj: arguments ){
                if(obj instanceof Book){
                    Book myBook = (Book)obj;
                    System.out.println("Info about book:  name - " +
                            myBook.getName() + ",  author " + myBook.getAuthor() +
                            ", year of publication - " +myBook.getYearOfPublication());

                }else if(obj instanceof String){
                    System.out.println("A book added to the library by " +obj);
                }
            }
        }

        System.out.println("beforeGetBookLoggingAdvice:  "+
                "Advice before logging and getting a book /magazine");
        System.out.println("----------------------------------------------------");
    }




//    @Before("execution( * return*())") // inside ("execution(public void getBook())") called pointcut
//    public void beforeReturningBookAdvice(){
//        System.out.println("beforeGetBookAdvice:  Advice before returning  a book or magazine");
//

   /*
     Advice is executed when an aspect is applied to a specific join point. It defines what the aspect
     should do when it intercepts a method or join point that matches the specified pointcut.

     Pointcut is a set of criteria that specifies which methods or join points in an application
     should be intercepted by an aspect. It allows you to define where in your code the aspect should be
     applied. For example, a pointcut expression
     might select all methods in a particular package or all methods with a specific annotation.
     */
     /*
      execution(public void get*()) - this works with method which starts get() w/o parameters,
      and with public access modifier, also  return type "void"

      execution(* getBook()) - this works with method  w/o parameters,
      and with any access modifier, also any return type "getBook"

      execution(* *()) - this works with method  w/o parameters,
       and with any access modifier, also any return types
      */


    }

