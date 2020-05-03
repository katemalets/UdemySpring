package hibernate.course.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class PrimaryKeyDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            Student student1 = new Student("Katya", "Malets", "katya@com");
            Student student2 = new Student("Dima", "Fedchenko", "dima@com");
            Student student3 = new Student("Ksu", "Gavrilova", "ksuchka_hrushka@com");
            session.beginTransaction();
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.getTransaction().commit();
        } catch (Exception exc){
            sessionFactory.close();
        }
    }
}
