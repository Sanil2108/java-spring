package mypackage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String joke;

    @Column
    private int votes;


    public Joke() {
    }

    public Joke(String joke, int votes) {
        this.joke = joke;
        this.votes = votes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoke() {
        return this.joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public int getVotes() {
        return this.votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Joke id(int id) {
        this.id = id;
        return this;
    }

    public Joke joke(String joke) {
        this.joke = joke;
        return this;
    }

    public Joke votes(int votes) {
        this.votes = votes;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", joke='" + getJoke() + "'" +
            ", votes='" + getVotes() + "'" +
            "}";
    }

}