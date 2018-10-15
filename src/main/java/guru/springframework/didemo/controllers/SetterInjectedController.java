package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

public class SetterInjectedController {
	public GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	public GreetingService setGreetingService(GreetingService greetingService){
		return this.greetingService = greetingService;
	}
}
