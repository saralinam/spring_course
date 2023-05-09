package aop.aspects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Consulting Detective")
    private String name;

    @Value("Sherlock Holmes")
    private String author;

    @Value("1994")
    private int yearOfPublication;


    //getter
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
