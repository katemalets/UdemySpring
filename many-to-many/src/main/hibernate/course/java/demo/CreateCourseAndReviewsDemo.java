package hibernate.course.java.demo;

import hibernate.course.java.entities.Course;
import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import hibernate.course.java.entities.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCourseAndReviewsDemo {
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
            Course course = new Course("Piano");
            Review review1 = new Review("a dump course");
            Review review2 = new Review("well course");
            Review review3 = new Review("great job");
            course.addReviews(review1);
            course.addReviews(review2);
            course.addReviews(review3);
            session.save(course);
            System.out.println("Course : " + course);
            System.out.println("Reviews : " + course.getReviews());
            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
