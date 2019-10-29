package mypackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mypackage.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
            SpringApplication.run(DiDemoApplication.class, args);

        // MyController controller = (MyController) applicationContext.getBean("myController");
        // controller.hello();
    }
}