package al.utile.professional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProfessionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessionalApplication.class, args);
	}

}
