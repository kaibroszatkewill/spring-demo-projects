package com.kewill.demo;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {
	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private Destination destination;

	public void sendMessage(final String msg) {
		if (destination == null) {
			jmsTemplate.send(new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					return session.createTextMessage(msg);
				}
			});
		} else {
			jmsTemplate.send(destination, new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					return session.createTextMessage(msg);
				}
			});
		}
	}
}
