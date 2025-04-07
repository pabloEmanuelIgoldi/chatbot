package com.chatbot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.service.openai.IOpenAIService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/question")
public class OpenAIController {
	
	@Autowired
    private IOpenAIService openAiService;

    @PostMapping
    public Map<String,String> generatePrompt(@RequestBody String pregunta){
    	log.info("INICIO EN OpenAIController.generatePrompt().");
        return this.openAiService.getPromt(pregunta);
    }
}
