package com.example.demo.zad1;

import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogCreator {

    public LogCreator(ConfigurableApplicationContext context) throws IOException {

        int portNumber=0;
        if(context.getEnvironment().getProperty("server.port", Integer.class) != null)
        {
           portNumber= context.getEnvironment().getProperty("server.port", Integer.class);

        }

        String fullName = "Jan Dragan";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);

        Logger logger = Logger.getLogger(Zad1Application.class.getName());

        Handler fileHandler = new FileHandler( "logger.log",2000, 5);
        logger.addHandler(fileHandler);

        logger.log(Level.INFO,"Imie:"  + fullName + " Data:" + date + " Port:" + portNumber);
    }
}
