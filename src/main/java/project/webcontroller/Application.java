package project.webcontroller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:dubbo.xml"})
@ComponentScan(basePackages = "project.webcontroller.controller")
@SpringBootApplication
public class Application {

    public static void main(String args[]){
            SpringApplication.run(Application.class, args);
        }

}
