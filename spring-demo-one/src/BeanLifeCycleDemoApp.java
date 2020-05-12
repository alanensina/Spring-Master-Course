import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alanensina.springdemo.interfaces.Coach;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve bean from Spring container
        Coach theCoach = context.getBean("myCoachTrack", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // Close he context
        context.close();
    }

}
