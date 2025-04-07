#  **Definición del proyecto**

Demostración de una aplicación integrada al chatgpt de Open AI.

#  **Configuración**
  Primero se tiene que obtener la api key de OPEN AI.
  
  Ir a:
  
  https://platform.openai.com/api-keys

  En "spring.ai.openai.api-key" del application.properties se debe copiar la clave propia de OPEN AI.

Tener en cuenta:
- Solo dejarán copiarla al momento de crearla. 
- Es una prueba gratuita solamente de 30 días desde el momento de crearla.
- Se puede bloquear por uso indebido (insultos, etc).


#  **Modo de Uso**

Cuando la aplicación este levantada correctamente se puede usar preguntando desde:

	http://localhost:8080/swagger-ui/index.html
 
O con curl:

   curl -X 'POST' 'http://localhost:8080/api/v1/question' -H 'Content-Type: application/json' -d '{  "pregunta": "Hablame de Messi" }'



#  **Documentación oficial Spring AI:**
https://spring.io/projects/spring-ai
