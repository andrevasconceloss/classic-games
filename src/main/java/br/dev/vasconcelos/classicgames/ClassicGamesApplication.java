package br.dev.vasconcelos.classicgames;

import br.dev.vasconcelos.classicgames.util.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassicGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassicGamesApplication.class, args);
		Log.info("Application is running.");
	}

}
