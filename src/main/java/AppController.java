

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	//@Value - injetar todos os valores das configurações com a notação
	@Value("${application.message}")
	private String appMessage;
	
	
	@GetMapping("/")
	public String getAppMessage() {
		return appMessage;
	}
}
