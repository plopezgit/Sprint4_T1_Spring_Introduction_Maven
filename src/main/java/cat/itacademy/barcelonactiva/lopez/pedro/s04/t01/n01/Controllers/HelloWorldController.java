package cat.itacademy.barcelonactiva.lopez.pedro.s04.t01.n01.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	@ResponseBody
	public String hi(@RequestParam(defaultValue = "UNKNOWN") String name) {
		return "Hi " + name + ", you are in";
	}
	
	@RequestMapping(value = {"/HelloWorld/{n}"})
	@ResponseBody
	public String hi2(@PathVariable(name = "n") String name) {
		return "Hi " + name + ", you are in";
	}

	/*
	 * https://www.baeldung.com/spring-optional-path-variables
	 * https://www.baeldung.com/spring-request-param
	 */
	
}
