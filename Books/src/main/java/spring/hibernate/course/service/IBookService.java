package spring.hibernate.course.service;

import spring.hibernate.course.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> showBooks();

    void saveBook(Book book);

    Book getBook(int id);

    void deleteBook(int id);
}
