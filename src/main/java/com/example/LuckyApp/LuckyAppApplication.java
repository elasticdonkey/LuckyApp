package com.example.LuckyApp;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LuckyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckyAppApplication.class, args);
	}
	@GetMapping("am-I-lucky")
	public String myLuckyDay(){
		Random random = new Random();
		return random.nextBoolean() ? " It's your Luck Day :D ": "Oh No ! Try again, HARDER :)";
	}
}
