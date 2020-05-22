package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

    public static void main(String[] args) {
        // Load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // Print some validations
        System.out.println("theCoach and alphaCoach are the same instances? " + (theCoach == alphaCoach));
        System.out.println("Memory location of theCoach: " + theCoach);
        System.out.println("Memory location of alphaCoach: " + alphaCoach);

        // Close the context
        context.close();
    }

}
