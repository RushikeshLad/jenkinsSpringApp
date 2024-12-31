package in.com.jenkinsdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class JenkinsDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeploymentApplication.class, args);
		int i  = 10;
		int j = 20;
	}


}
