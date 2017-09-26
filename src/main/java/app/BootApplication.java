package app;

import app.bean.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BootApplication {

	@Autowired
	private MainController mainController;

	@PostConstruct
	public void init(){
		mainController.showData();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
