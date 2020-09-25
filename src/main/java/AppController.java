

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	//@Value - inject all configuration values with the annotation 
	@Value("${application.message}")
	private String appMessage;
	
	
	@GetMapping("/")
	public String getAppMessage() {
		return appMessage;
	}
}
