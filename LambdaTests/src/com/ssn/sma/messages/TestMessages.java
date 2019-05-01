package com.ssn.sma.messages;

public class TestMessages {

	public static void main(String[] args) {
// maybe som changes are necesary
		Message.send(mailer -> mailer.from().to().subject().content());
		

	}

}
