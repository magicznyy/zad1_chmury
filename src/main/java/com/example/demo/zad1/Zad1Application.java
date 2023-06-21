package com.example.demo.zad1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDateTime;


@SpringBootApplication
public class Zad1Application {


	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(Zad1Application.class, args);

		try {
			LogCreator logCreator = new LogCreator(context);
		}catch (Exception e ){
			e.printStackTrace();
		}
		try {
			openHomePage();
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	private static void openHomePage() throws IOException {
		try {
			if (Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				if (desktop.isSupported(Desktop.Action.BROWSE)) {
					desktop.browse(URI.create("http://localhost:8080/info"));
				}
			}
		} catch (IOException | InternalError e) {
			e.printStackTrace();
		}
	}



}
