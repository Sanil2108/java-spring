package mypackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import mypackage.MyConfiguration;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext();
        a.register(MyConfiguration.class);
        a.refresh();

        // MyBean myBean = a.getBean(MyBean.class);

        // System.out.println("Hello, "+myBean.getMessage());

        a.close();
    }
}