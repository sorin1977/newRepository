package com.ssn.sma.messages;

import java.util.function.Consumer;

public class Message {
	public Message from() {
		System.out.println("from");
		return this;
	}

	public Message to() {
		System.out.println("to");
		return this;
	}

	public Message subject() {
		System.out.println("subject");
		return this;
	}
	
	
	public Message content() {
		System.out.println("content");
		return this;
	}
	public static void send(Consumer  <Message> block) {
		Message m= new Message();
		block.accept(m);
		System.out.println("send.....");
	}
}
