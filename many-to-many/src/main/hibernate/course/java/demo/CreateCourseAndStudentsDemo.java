package hibernate.course.java.demo;

import hibernate.course.java.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCourseAndStudentsDemo {
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
            Course course = new Course("Piano");
            session.save(course);

            Student student1 = new Student("Katya","Makets","myemail");
            Student student2 = new Student("Nikita","Poitryk","nick@gmail.com");

            course.addStudent(student1);
            course.addStudent(student2);

            session.save(student1);
            session.save(student2);
            System.out.println("Course : " + course);
            System.out.println("Students : " + course.getStudents());
            session.getTransaction().commit();

        } catch (Exception exc){
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}
