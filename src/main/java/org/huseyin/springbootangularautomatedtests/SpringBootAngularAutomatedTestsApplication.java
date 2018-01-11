package org.huseyin.springbootangularautomatedtests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootAngularAutomatedTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularAutomatedTestsApplication.class, args);
	}
}

class AdditionResult {
	private int x;
	private int y;
	private int result;

	public AdditionResult(int x, int y, int result) {
		this.setX(x);
		this.setY(y);
		this.setResult(result);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}

@Service
class AdditionService {

	public AdditionService() {}

	public int add (int x, int y) {
		return x + y;
	}
}

//@Controller
//class DefaultController {
//	@GetMapping("/")
//
//}

@RestController
class AdditionRestController {

	@Autowired
	AdditionService additionService;

	@RequestMapping("/addition")
	public AdditionResult addition(@RequestParam(value="x") int x, @RequestParam(value = "y") int y) {
		return new AdditionResult(x, y, additionService.add(x, y));
	}
}