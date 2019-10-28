package mypackage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;

    @OneToOne
    private Book book;

    public Publisher() {
    }

    public Publisher(Long id, String publisherName, Book publisher) {
        this.id = id;
        this.publisherName = publisherName;
        this.book = publisher;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return this.publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book publisher) {
        this.book = publisher;
    }

    public Publisher id(Long id) {
        this.id = id;
        return this;
    }

    public Publisher publisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    public Publisher publisher(Book publisher) {
        this.book = publisher;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Publisher)) {
            return false;
        }
        Publisher publisher = (Publisher) o;
        return this.id == null ? publisher.id == null : this.id == publisher.id;
    }

    @Override
    public int hashCode() {
        return this.id == null ? 0 : this.id.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", publisherName='" + getPublisherName() + "'" +
            ", publisher='" + getBook() + "'" +
            "}";
    }



}