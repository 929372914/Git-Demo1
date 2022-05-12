package com.duing;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Log4jApplication {
    private static final Logger logger = Logger.getLogger (Log4jApplication.class);
    public static void main(String[] args) {
        SpringApplication.run (Log4jApplication.class, args);
        logger.info ("Log4jApplication start");
    }

}
