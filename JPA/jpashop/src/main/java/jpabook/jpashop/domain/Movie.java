package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity

public class Movie extends Item {
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    private String actor;
    private String Director;
}
