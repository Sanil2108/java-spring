package mypackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mypackage.managers.JokeManager;

@SpringBootApplication
public class MyApplication {

    @Bean
    public JokeManager getJokeManager() {
        return JokeManager.getInstance();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}