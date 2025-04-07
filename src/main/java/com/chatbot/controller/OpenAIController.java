package com.chatbot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.dto.PreguntaRequestDTO;
import com.chatbot.dto.ResponseDTO;
import com.chatbot.service.openai.IOpenAIService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/question")
public class OpenAIController {
	
	@Autowired
    private IOpenAIService openAiService;

    @PostMapping
    public ResponseEntity<ResponseDTO> generatePrompt(@RequestBody PreguntaRequestDTO request){
    	log.info("INICIO EN OpenAIController.generatePrompt().");
    	try {
        	Map<String, String> respuesta = this.openAiService.getPromt(request.getPregunta());
        	return ResponseEntity.status(HttpStatus.ACCEPTED)
    				 .body(ResponseDTO.builder().respuesta(respuesta.get("completion")).build());
    	}catch (Exception e) {
    		log.error("ERROR EN COMPRA CONTROLLER delete(). MENSAJE: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
								 .body(ResponseDTO.builder().respuesta("ERROR INTERNO AL INTENTAR CONTRUIR LA RESPUESTA.").build());
		}
    }
}
