package hello.core.beandefinition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AppConfig;

public class BeanDefinitionTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    // GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");

    /**
     * BeanDefinition
     * 
     * BeanClassName: Bean's class name
     * factoryBeanName: name if you use a bean for the factory role
     * factoryMethodName: Specify the factory method to create the bean
     * Scope: singleton(default)
     * lazyInit: not creating Bean when Spring Container is created, whether the generation is delayed as much as possible until the actual bean is used.
     * initMethodName: initialization method name called after creating a bean, applying dependencies
     * DestroyMethodName: method name called just before the end of the bean's life cycle and removal
     * Constructor arguments, Properties: used to inject dependencies
     */
    @Test
    @DisplayName("confirm Bean meta Configuration")
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                System.out.println("beanDefinitionName" + beanDefinitionName + " beanDefinition = " + beanDefinition);
            }
        }
    }
}
