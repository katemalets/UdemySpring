package spring.course.java;

public class MyApp {
    public static void main(String[] args) {

        Coach coach = new DanceCoach();
        System.out.println(coach.getDailyWorkOut());
    }
}
