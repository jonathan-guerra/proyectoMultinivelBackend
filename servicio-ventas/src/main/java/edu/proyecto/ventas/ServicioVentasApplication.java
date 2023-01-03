package edu.proyecto.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EntityScan({"edu.proyecto.categorias.model",
			 "edu.proyecto.ventas.model"})
public class ServicioVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioVentasApplication.class, args);
	}

}
