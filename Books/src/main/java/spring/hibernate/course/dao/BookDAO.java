package spring.hibernate.course.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.hibernate.course.entity.Book;

import java.util.List;

@Repository
public class BookDAO implements IBookDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> showBooks() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book",
                Book.class);
        List<Book> books = query.getResultList();
        return books;
    }

    @Override
    public void saveBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
    }

    @Override
    public Book getBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, id);
        return book;
    }

    @Override
    public void deleteBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Book where id=:bookId");
        query.setParameter("bookId",id);
        query.executeUpdate();
    }

    @Override
    public List<Book> sortByYear() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by year");
        return query.getResultList();
    }

    @Override
    public List<Book> sortByYearDesc() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by year desc ");
        return query.getResultList();
    }

    @Override
    public List<Book> sortByMark() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by mark desc");
        return query.getResultList();
    }

    @Override
    public List<Book> sortByMarkBest() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book where mark>=7");
        return query.getResultList();
    }

    @Override
    public List<Book> sortByAuthor() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by name");
        return query.getResultList();
    }

    @Override
    public List<Book> sortByName() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by author");
        return query.getResultList();
    }

    @Override
    public List<Book> sortById() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by id");
        return query.getResultList();
    }
}
