package in.com.jenkinsdeployment.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Deployment on Jenkins Are Successsfully Done";
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Jenkins Deployment by Rushi";
		logger.info("***** greetMsg() execution end *****");
		return msg;
	}
	
}
