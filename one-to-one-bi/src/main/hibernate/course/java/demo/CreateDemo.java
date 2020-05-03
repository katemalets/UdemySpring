package hibernate.course.java.demo;

import hibernate.course.java.entities.Instructor;
import hibernate.course.java.entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
//            Instructor instructor = new Instructor("Katya",
//                    "Malets", "katemaletss@gmail.com");
//            InstructorDetail instructorDetail = new
//                    InstructorDetail("no_youtube_sorry",
//                    "table tennis");
//            instructor.setInstructorDetail(instructorDetail);

            Instructor instructor = new Instructor("Dima",
                    "Fedc", "higuy@gmail.com");
            InstructorDetail instructorDetail = new
                    InstructorDetail("dima_old",
                    "biking");
            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            System.out.println("Saving instructor");
            session.save(instructor);
            session.getTransaction().commit();
        } catch (Exception exc){
            sessionFactory.close();
        }
    }
}
