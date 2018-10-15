package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {
	public GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService){
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
