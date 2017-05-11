package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;


import com.edu.interfaz.Operaciones;

@Configuration
@ComponentScan("com.edu")
public class AppConfig {
	
	@Bean("suma")
	public HessianProxyFactoryBean servicioOperaciones(){
		HessianProxyFactoryBean proxy = new HessianProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/sumaHessian");
		proxy.setServiceInterface(Operaciones.class);
		return proxy;
	}
	
}
