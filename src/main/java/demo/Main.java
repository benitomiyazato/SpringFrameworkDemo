package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.setQualification("Qualification X");
        System.out.printf("Doctor1: Qualification: %s\n", doctor1.getQualification());

        Doctor doctor2 = context.getBean(Doctor.class);
        System.out.printf("Doctor2: Qualification: %s", doctor2.getQualification());
    }
}
