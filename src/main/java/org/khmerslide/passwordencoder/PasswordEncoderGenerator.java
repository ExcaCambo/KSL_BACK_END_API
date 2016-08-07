package org.khmerslide.passwordencoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderGenerator {
	
	public String getPassword(String password){
		int i = 0;
		while (i < 10) {
/*			String password = "123456";*/
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);

			System.out.println(hashedPassword);
			i++;
		}
		return password;
	}
}
