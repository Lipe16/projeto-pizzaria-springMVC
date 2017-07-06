package br.com.filipe.pizzaria;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Teste {

	public static void main(String[] args) {
		
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			System.out.println(encoder.encode("admin"));
		

	}

}
