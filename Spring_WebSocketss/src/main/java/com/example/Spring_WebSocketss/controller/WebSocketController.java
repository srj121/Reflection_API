package com.example.Spring_WebSocketss.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

   @MessageMapping("/message")
   @SendTo("/topic/greetings")
   public Greeting greeting(Message<?> message) throws Exception {
	   System.out.println("WebSocketController");
      return new Greeting("Hello, " +  message.getHeaders() + "!");
   }
}
