package hibernate.course.java.demo;

import hibernate.course.java.entities.Course;
import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCourseDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            int id = 1;

            Course course1 = new Course("Piano is about my life");
            Course course2 = new Course("Guitar is the best");

            Instructor instructor = session.get(Instructor.class, id);

            instructor.addCourse(course1);
            instructor.addCourse(course2);

            session.save(course1);
            session.save(course2);

            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
