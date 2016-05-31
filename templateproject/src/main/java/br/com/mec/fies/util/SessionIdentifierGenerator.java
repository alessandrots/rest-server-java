package br.com.mec.fies.util;

import java.math.BigInteger;
import java.security.SecureRandom;

public class SessionIdentifierGenerator {
	private SecureRandom random = new SecureRandom();

	public String nextSessionId() {
		return new BigInteger(130, random).toString(32);
	}
	
	public static void main(String[] args) {
		SessionIdentifierGenerator sig = new SessionIdentifierGenerator();
		
		for (int i = 0; i < 20; i++) {
			System.out.println(" next session id = " + sig.nextSessionId());
		}
	}
}
