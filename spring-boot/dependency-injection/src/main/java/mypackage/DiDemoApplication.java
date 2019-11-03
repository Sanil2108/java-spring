package mypackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mypackage.controllers.ConstructorInjectedController;
import mypackage.controllers.MyController;
import mypackage.controllers.PropertyInjectedController;
import mypackage.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
            SpringApplication.run(DiDemoApplication.class, args);

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        System.out.println(ctx.getBean(MyController.class).sayHello());
    }
}