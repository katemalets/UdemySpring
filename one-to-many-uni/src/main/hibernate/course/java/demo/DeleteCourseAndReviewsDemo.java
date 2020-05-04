package hibernate.course.java.demo;

import hibernate.course.java.entities.Course;
import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import hibernate.course.java.entities.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteCourseAndReviewsDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            int id = 10;
            Course course = session.get(Course.class, id);
            session.delete(course);
            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
