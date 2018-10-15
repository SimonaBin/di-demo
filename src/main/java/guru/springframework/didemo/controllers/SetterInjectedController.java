package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	public GreetingService setGreetingService(GreetingService greetingService){
		return this.greetingService = greetingService;
	}
}
