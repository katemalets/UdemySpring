package hibernate.course.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentReadDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            Student student = new Student("Max", "Malets", "malets@gmail.com");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            System.out.println("* We created here * " + student);

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Student myStudent = session.get(Student.class, student.getId());
            System.out.println(" * We took him from base * " + myStudent);
            session.getTransaction().commit();
        } catch (Exception exc){
            sessionFactory.close();
        }
    }
}
