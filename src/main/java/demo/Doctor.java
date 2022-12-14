package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Calling setBeanName now!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Calling postConstruct method now!");
    }
}
