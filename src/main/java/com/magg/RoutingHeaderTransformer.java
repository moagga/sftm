package com.magg;

import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class RoutingHeaderTransformer {

	private boolean toggle = false;
	
	@Transformer
	public Message<?> transform(Message<?> message){
		MessageBuilder<?> mb = MessageBuilder.fromMessage(message);
		mb.setHeader("toggle", Boolean.toString(toggle));
		toggle = !toggle;
		return mb.build();
	}
	
}
