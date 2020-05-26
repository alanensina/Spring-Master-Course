package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotations.model.SwimCoach;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // Read Spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from Spring Container
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        // Call a method on the bean
        System.out.println("swimCoach: " + swimCoach.getDailyWorkout());
        System.out.println();

        // Call the method get daily fortune
        System.out.println("swimCoach: " + swimCoach.getDailyFortune());

        // Call new methods
        System.out.println("Email: " + swimCoach.getEmail());
        System.out.println("Team: " + swimCoach.getTeam());

        // Close the context
        context.close();

    }

}
