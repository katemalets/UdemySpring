package hibernate.course.java.demo;

import hibernate.course.java.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteCourseForStudentDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            int id = 1;
            int cid = 10;
            Student student = session.get(Student.class, id);
            Course course = session.get(Course.class,cid);
            System.out.println("Student : " + student);
            session.delete(course);

            System.out.println("Courses for her : " + student.getCourses());

            session.getTransaction().commit();
            System.out.println("Done");
        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
