package co.edu.ucatolica.hexa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HexaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexaApplication.class, args);
		System.out.println("Abriendo la conexión");
	}

}
