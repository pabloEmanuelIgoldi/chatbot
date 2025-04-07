package com.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ChatbotApplication {

	public static void main(String[] args) {

		
		try {
			log.info("INICIO APLICACION CHATBOT.");
			SpringApplication.run(ChatbotApplication.class, args);
			log.info("INICIO DE LA APLICACION CHATBOT EXITOSO.");
		} catch (Exception e) {
			log.error("INICIO DE LA APLICACION CHATBOT CON ERROR: " + e);
			throw e;
		}
	}

}
