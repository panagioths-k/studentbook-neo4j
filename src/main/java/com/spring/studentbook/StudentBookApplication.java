package com.spring.studentbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//https://neo4j.com/developer/spring-data-neo4j/
//https://github.com/neo4j-examples/movies-java-spring-data-neo4j
//https://spring.io/guides/gs/consuming-rest-jquery/

@SpringBootApplication
@ComponentScan({"com.spring.studentbook"}) // this is the root package of everything
@EntityScan("com.spring.studentbook")
public class StudentBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentBookApplication.class, args);
    }

}
