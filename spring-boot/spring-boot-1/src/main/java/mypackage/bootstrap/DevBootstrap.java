package mypackage.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import mypackage.models.*;

import mypackage.repositories.AuthorRepository;
import mypackage.repositories.BookRepository;
import mypackage.repositories.PublisherRepository;;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher publisher1 = new Publisher();
        publisher1.setPublisherName("publisher1");

        Publisher publisher2 = new Publisher();
        publisher2.setPublisherName("publisher2");

        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);

        Author sanil = new Author("Sanil", "Khurana");
        Book myBook1 = new Book("MyBook1", "123");
        myBook1.setPublisher(publisher1);
        sanil.getBooks().add(myBook1);
        myBook1.getAuthors().add(sanil);

        authorRepository.save(sanil);
        bookRepository.save(myBook1);


        Author sanil2 = new Author("Sanil2", "Khurana2");
        Book myBook2 = new Book("MyBook2", "1234");
        myBook2.setPublisher(publisher2);
        sanil2.getBooks().add(myBook2);
        myBook2.getAuthors().add(sanil2);
        myBook2.getAuthors().add(sanil);


        authorRepository.save(sanil2);
        bookRepository.save(myBook2);

        publisher1.setBook(myBook1);
        publisher2 .setBook(myBook2);

        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);
    }

}