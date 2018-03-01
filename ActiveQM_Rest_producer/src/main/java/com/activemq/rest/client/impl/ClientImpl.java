package com.activemq.rest.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activemq.rest.client.Client;
import com.activemq.rest.producer.Producer;


@Service
public class ClientImpl implements Client{
	
	@Autowired
	Producer jmsProducer;

	@Override
	public void send(String msg) {
		jmsProducer.send(msg);
		
	}
	
}
