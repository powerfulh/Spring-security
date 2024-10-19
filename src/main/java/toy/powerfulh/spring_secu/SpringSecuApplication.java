package toy.powerfulh.spring_secu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class SpringSecuApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringSecuApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter());
		springApplication.run();
	}

}
