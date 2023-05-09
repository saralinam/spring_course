package aop;

import aop.aspects.AbstractLibrary;
import aop.aspects.Book;
import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

//    @Override
////    public void getBook(){
////        System.out.println("We are getting a book from university library");
////    }


    public void getBook(){

        System.out.println("We are getting a book from university library  " );
        System.out.println("----------------------------------------------------");
    }


     public void returnBook(){
        System.out.println("We are returning a book to the University Library ");
         System.out.println("----------------------------------------------------");
    }


    public void getMagazine(){
        System.out.println("We are getting a magazine from university library");
        System.out.println("----------------------------------------------------");
    }


    public void returnMagazine(){
        System.out.println("We are returning a magazine from university library");
        System.out.println("----------------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("We are adding a book to university library  " );
        System.out.println("----------------------------------------------------");
    }


    public void addMagazine(){
        System.out.println("We are adding a magazine to university library  " );
        System.out.println("----------------------------------------------------");
    }
}
