package hibernate.course.java.demo;

import hibernate.course.java.entities.Course;
import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class EagerVsLazy {
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
            Query<Instructor> query = session.createQuery("select i from Instructor i " +
                    "JOIN FETCH i.courses where i.id=:instructorId", Instructor.class);
            query.setParameter("instructorId", id);
            Instructor instructor = query.getSingleResult();
            System.out.println("Instructor : " + instructor);
            session.close();
            System.out.println("Instructor courses : " + instructor.getCourses());
            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
