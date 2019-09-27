package gov.hhs.ie.nv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = { "hhs.ie", "gov.hhs",
		"ng4.lang" }, exclude = HibernateJpaAutoConfiguration.class)

public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
