package spring.hibernate.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.hibernate.course.dao.IBookDAO;
import spring.hibernate.course.entity.Book;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookDAO iBookDAO;

    @Override
    @Transactional
    public List<Book> showBooks() {
        return iBookDAO.showBooks();
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        iBookDAO.saveBook(book);
    }

    @Override
    @Transactional
    public Book getBook(int id) {
        return iBookDAO.getBook(id);
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        iBookDAO.deleteBook(id);
    }

    @Override
    @Transactional
    public List<Book> sortByYear() {
        return iBookDAO.sortByYear();
    }

    @Override
    @Transactional
    public List<Book> sortByYearDesc() {
        return iBookDAO.sortByYearDesc();
    }

    @Override
    @Transactional
    public List<Book> sortByMark() {
        return iBookDAO.sortByMark();
    }

    @Override
    @Transactional
    public List<Book> sortByMarkBest() {
        return iBookDAO.sortByMarkBest();
    }

    @Override
    @Transactional
    public List<Book> sortByAuthor() {
        return iBookDAO.sortByAuthor();
    }

    @Override
    @Transactional
    public List<Book> sortByName() {
        return iBookDAO.sortByName();
    }

    @Override
    @Transactional
    public List<Book> sortById() {
        return iBookDAO.sortById();
    }
}
