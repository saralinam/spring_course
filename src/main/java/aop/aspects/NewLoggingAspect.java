package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    /*
    Advice @Around
     */
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)throws Throwable  {

        //Advice type  @Around & working with exceptions
            System.out.println("aroundReturnBookLoggingAdvice: "
                    + " We are going to return the book to library ");

        Object targetMethodResult =null;
        try {
                targetMethodResult = proceedingJoinPoint.proceed();
            }catch(Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: cached the exception " + e);

            targetMethodResult = " unknown name of the book";

//            throw e;  //catch & throwing away exception
        }

            System.out.println("aroundReturnBookLoggingAdvice: "
                    + " successfully return the book to library ");


            return targetMethodResult;
        }






//            System.out.println("aroundReturnBookLoggingAdvice: "
//                    + " We are going to return the book to library ");
//
//
//    Long begin = System.currentTimeMillis();
//    Object targetMethodResult = proceedingJoinPoint.proceed();
//    Long end = System.currentTimeMillis();
//
//            System.out.println("aroundReturnBookLoggingAdvice: "
//                    + " successfully return the book to library ");
//
//        System.out.println("aroundReturnBookLoggingAdvice: method returnBook " +
//                "did the job "+ (end-begin) + "  millis");
//
//            return targetMethodResult;
//}


}
