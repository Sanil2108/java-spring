package mypackage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import mypackage.models.Recipe;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private String email;

    @Column
    private String url;

    @Column
    private String name;

    @Column
    private String password;

    @OneToMany
    private List<Recipe> created;

    @ManyToMany
    private List<Recipe> upvoted;

    @ManyToMany
    private List<Recipe> downvoted;


    public User() {
    }

    public User(String email, String name, String password, String url) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.created = new ArrayList<>();
        this.upvoted = new ArrayList<>();
        this.downvoted = new ArrayList<>();
        this.url = url;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUrl() {
        return this.url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Recipe> getCreated() {
        return this.created;
    }

    public void setCreated(List<Recipe> created) {
        this.created = created;
    }

    public List<Recipe> getUpvoted() {
        return this.upvoted;
    }

    public void setUpvoted(List<Recipe> upvoted) {
        this.upvoted = upvoted;
    }

    public List<Recipe> getDownvoted() {
        return this.downvoted;
    }

    public void setDownvoted(List<Recipe> downvoted) {
        this.downvoted = downvoted;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User url(String url) {
        this.url = url;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User created(List<Recipe> created) {
        this.created = created;
        return this;
    }

    public User upvoted(List<Recipe> upvoted) {
        this.upvoted = upvoted;
        return this;
    }

    public User downvoted(List<Recipe> downvoted) {
        this.downvoted = downvoted;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return user.getEmail().equals(this.getEmail());
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", name='" + getName() + "'" +
            ", password='" + getPassword() + "'" +
            ", created='" + getCreated() + "'" +
            ", upvoted='" + getUpvoted() + "'" +
            ", downvoted='" + getDownvoted() + "'" +
            "}";
    }



}