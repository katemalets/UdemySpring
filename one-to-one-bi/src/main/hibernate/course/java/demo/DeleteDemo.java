package hibernate.course.java.demo;

import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            int id = 3;
            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, id);
            System.out.println("Found instructor : " + instructor);
            if (instructor != null){
                System.out.println("Deleting instructor with id : " + instructor);
                session.delete(instructor);
            }
            session.getTransaction().commit();
        } catch (Exception exc){
            sessionFactory.close();
        }
    }
}
