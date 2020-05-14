package spring.hibernate.course.dao;

import spring.hibernate.course.entity.Book;

import java.util.List;

public interface IBookDAO {
    List<Book> showBooks();

    void saveBook(Book book);

    Book getBook(int id);

    void deleteBook(int id);

    List<Book> sortByYear();

    List<Book> sortById();

    List<Book> sortByYearDesc();

    List<Book> sortByMark();

    List<Book> sortByMarkBest();

    List<Book> sortByAuthor();

    List<Book> sortByName();
}
