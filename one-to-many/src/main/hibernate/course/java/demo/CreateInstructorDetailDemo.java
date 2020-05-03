package hibernate.course.java.demo;

import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDetailDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            int id = 4;
            session.beginTransaction();
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);
            System.out.println("Our instructorDetail : " + instructorDetail);
            System.out.println("Our instructor : " + instructorDetail.getInstructor());
            instructorDetail.getInstructor().setInstructorDetail(null);
            session.delete(instructorDetail);
            session.getTransaction().commit();
        } catch (Exception exc){
            exc.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
