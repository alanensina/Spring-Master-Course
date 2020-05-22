package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // Read Spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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
