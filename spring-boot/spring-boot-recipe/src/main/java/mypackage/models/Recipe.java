package mypackage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import java.util.List;

import mypackage.models.User;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String recipe;

    @Column
    private int points;

    @ManyToOne
    private User owner;

    @ManyToMany(mappedBy = "upvoted")
    private List<User> upvotedBy;

    @ManyToMany(mappedBy = "downvoted")
    private List<User> downvotedBy;

    public Recipe() {
    }

    public Recipe(String name, String description, String recipe, int points, User owner, List<User> upvotedBy, List<User> downvotedBy) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.points = points;
        this.owner = owner;
        this.upvotedBy = upvotedBy;
        this.downvotedBy = downvotedBy;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecipe() {
        return this.recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<User> getUpvotedBy() {
        return this.upvotedBy;
    }

    public void setUpvotedBy(List<User> upvotedBy) {
        this.upvotedBy = upvotedBy;
    }

    public List<User> getDownvotedBy() {
        return this.downvotedBy;
    }

    public void setDownvotedBy(List<User> downvotedBy) {
        this.downvotedBy = downvotedBy;
    }

    public Recipe id(Long id) {
        this.id = id;
        return this;
    }

    public Recipe name(String name) {
        this.name = name;
        return this;
    }

    public Recipe description(String description) {
        this.description = description;
        return this;
    }

    public Recipe recipe(String recipe) {
        this.recipe = recipe;
        return this;
    }

    public Recipe points(int points) {
        this.points = points;
        return this;
    }

    public Recipe owner(User owner) {
        this.owner = owner;
        return this;
    }

    public Recipe upvotedBy(List<User> upvotedBy) {
        this.upvotedBy = upvotedBy;
        return this;
    }

    public Recipe downvotedBy(List<User> downvotedBy) {
        this.downvotedBy = downvotedBy;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Recipe)) {
            return false;
        }
        return ((Recipe)o).getId().equals(this.getId());
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", recipe='" + getRecipe() + "'" +
            ", points='" + getPoints() + "'" +
            ", owner='" + getOwner() + "'" +
            ", upvotedBy='" + getUpvotedBy() + "'" +
            ", downvotedBy='" + getDownvotedBy() + "'" +
            "}";
    }

}