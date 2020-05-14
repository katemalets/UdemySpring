package spring.hibernate.course.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotBlank(message = "you have to fill it in, guy!")
    private String name;

    @Column(name = "author")
    @NotBlank(message = "you have to fill it in, guy!")
    private String author;

    @Column(name = "year")
    @PositiveOrZero(message = "year can't be negative,smth went wrong")
    private int year;

    @Column(name = "mark")
    @Min(value = 0, message = "this mark has to be more than 0")
    @Max(value = 10, message = "this mark has to be less than 10")
    private int mark;

    public Book(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", mark=" + mark +
                '}';
    }
}
