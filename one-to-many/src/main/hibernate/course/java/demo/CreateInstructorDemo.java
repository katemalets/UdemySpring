package hibernate.course.java.demo;

import hibernate.course.java.entities.Course;
import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateInstructorDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            Instructor instructor = new Instructor("Katya",
                    "Malets", "katemaletss@gmail.com");
            InstructorDetail instructorDetail = new
                    InstructorDetail("no_youtube_sorry",
                    "table tennis");
            instructor.setInstructorDetail(instructorDetail);


            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            System.out.println("Saving instructor");
            session.save(instructor);
            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
