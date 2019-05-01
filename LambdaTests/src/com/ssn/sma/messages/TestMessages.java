package com.ssn.sma.messages;

public class TestMessages {

	public static void main(String[] args) {
		System.out.println("mail 1");
		Message.send(mailer -> mailer.from().to().subject().content());
		System.out.println("mail 2");
		Message.send(mailer -> mailer.from().content());
		//// what the hell???

	}

}
