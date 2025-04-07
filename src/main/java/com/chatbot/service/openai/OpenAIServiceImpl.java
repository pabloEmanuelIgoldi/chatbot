package com.chatbot.service.openai;

import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAIServiceImpl implements IOpenAIService {
	
	@Autowired 
	ChatClient chatClient;
	 

	@Override
	public Map<String, String> getPromt(String pregunta) {
        return Map.of("completion",this.chatClient.prompt().user(pregunta).call().content());		
	}

	@Override
	public String getPromtDocument(String mensaje) {
		// TODO Auto-generated method stub
		return null;
	}
}
