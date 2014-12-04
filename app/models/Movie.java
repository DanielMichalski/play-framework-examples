package models;

import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Author: Daniel
 */
@Entity
public class Movie extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    public String title;

    @Column(name = "country")
    public String country;

    @Column(name = "year")
    public int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static Finder<Long, Movie> find = new Finder<>(Long.class, Movie.class);
}
