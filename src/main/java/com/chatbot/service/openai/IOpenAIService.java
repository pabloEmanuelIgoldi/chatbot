package com.chatbot.service.openai;

import java.util.Map;

public interface IOpenAIService {

	Map<String,String> getPromt(String pregunta);

}
