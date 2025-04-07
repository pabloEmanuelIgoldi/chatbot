package com.chatbot.service.openai;

import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OpenAIServiceImpl implements IOpenAIService {

	@Autowired
	ChatClient chatClient;

	@Override
	public Map<String, String> getPromt(String pregunta) {
		log.info("INICIO EN OpenAIServiceImpl.getPromt().");
		try {
			return Map.of("completion", this.chatClient.prompt().user(pregunta).call().content());
		} catch (Exception e) {
			log.error("ERROR EN OpenAIServiceImpl.getPromt().");
			throw e;
		}
	}

}
