package hibernate.course.java.demo;

import hibernate.course.java.entities.Course;
import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GetInstructorCoursesDemo {
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


            Instructor instructor = session.get(Instructor.class, id);
            System.out.println("Instructor : " + instructor);
            System.out.println("Instructor courses : " + instructor.getCourses());
            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
