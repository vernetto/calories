package org.pierre.calories.model;

import javax.persistence.*;

@Entity
public class Meal {

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    User user;

    Integer cal;
    String datetime;
    String text;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public Meal() {
    }

    public Meal(User user, String datetime, String text, Integer cal) {
        this.user = user;
        this.datetime = datetime;
        this.text = text;
        this.cal = cal;
    }
}
