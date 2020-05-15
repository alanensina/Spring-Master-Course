package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // Read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from Spring Container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        Coach soccerCoach = context.getBean("soccerCoach", Coach.class);

        // Call a method on the bean
        System.out.println("tennisCoach: " + tennisCoach.getDailyWorkout());
        System.out.println("soccerCoach: " + soccerCoach.getDailyWorkout());
        System.out.println();

        // Call the method get daily fortune
        System.out.println("tennisCoach: " + tennisCoach.getDailyFortune());
        System.out.println("soccerCoach: " + soccerCoach.getDailyFortune());

        // Close the context
        context.close();

    }

}
