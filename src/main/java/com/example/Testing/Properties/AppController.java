package com.example.Testing.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
	
	//@Value - injetar todos os valores das configurações com a notação
	
	@Value("${app.message}")
	private String appMessage;
	
	@Value("${ENV_DB_URL:NENHUMA}")
	private String dbEnvironmentVariable;
	
	@GetMapping("/")
	public String getAppMessage() {
		return appMessage;
	}
	
	@GetMapping("/envVariable")
	public String getEnvironmentVariable() {
		return "A seguinte variável de ambiente foi passada: "+dbEnvironmentVariable;
 	}
}
