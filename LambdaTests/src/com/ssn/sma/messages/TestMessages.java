package com.ssn.sma.messages;

public class TestMessages {

	public static void main(String[] args) {

		Message.send(mailer -> mailer.from().to().subject().content());

	}

}
