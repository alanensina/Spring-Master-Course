import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alanensina.springdemo.interfaces.Coach;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from Spring container
        Coach theCoach = context.getBean("myCoachTrack", Coach.class);

        Coach alphaCoach = context.getBean("myCoachTrack", Coach.class);

        // Check if they are the same beans
        System.out.println("Are the same beans? " + (theCoach == alphaCoach));
        System.out.println("Memory locatio for theCoach: " + theCoach);
        System.out.println("Memory locatio for alphaCoach: " + alphaCoach);
        
        // Close he context
        context.close();
    }

}
