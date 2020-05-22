package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // Read Spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from Spring Container
        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        // Call a method on the bean
        System.out.println("swimCoach: " + swimCoach.getDailyWorkout());
        System.out.println();

        // Call the method get daily fortune
        System.out.println("swimCoach: " + swimCoach.getDailyFortune());

        // Close the context
        context.close();

    }

}
