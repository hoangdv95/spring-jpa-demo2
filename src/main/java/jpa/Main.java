package jpa;

import jpa.config.SpringConfig;
import jpa.entity.CategoryEntity;
import jpa.repository.BookRepository;
import jpa.repository.CategoryRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by PC on 06/08/17.
 */
public class Main {
//    static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//    static BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
//    static CategoryRepository categoryRepository = (CategoryRepository) context.getBean("categoryRepository");

    public static void main(String[] args) {
//        createNewBookEnTryWithNewCategory();
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
