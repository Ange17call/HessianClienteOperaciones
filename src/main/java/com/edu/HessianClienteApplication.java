package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.edu.interfaz.Operaciones;

@SpringBootApplication
public class HessianClienteApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(HessianClienteApplication.class, args);
		Operaciones op=(Operaciones) context.getBean("suma",Operaciones.class);
		System.out.println("El resulatdo de la sum aes:   "+op.suma(2, 3));
	}
}
