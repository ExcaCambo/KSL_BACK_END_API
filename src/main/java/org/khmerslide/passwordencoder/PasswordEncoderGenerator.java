package org.khmerslide.passwordencoder;

import java.util.Base64;
import java.nio.charset.StandardCharsets;


public class PasswordEncoderGenerator {
	public void EncoderPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(password.getBytes(StandardCharsets.UTF_8) );
		System.out.println(encodedString);

	}
	public static void DecoderPassword(String encodedString){
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(encodedString);
		//Verify the decoded string
		System.out.println(new String(decodedByteArray));
	}
	 public static void main(String[] str){
		 PasswordEncoderGenerator p = new PasswordEncoderGenerator();
		 p.EncoderPassword("chhaichivon");
	 }
}
