package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/*
	 * Spring이 자동으로 설정해준다. 해당 설정을 변경하고 싶은 경우에만 작성해주면 된다.
	 * 
	 * @Bean
	 * public MessageSource messageSource() {
	 * ResourceBundleMessageSource messageSource = new
	 * ResourceBundleMessageSource();
	 * messageSource.setBasenames("messages", "errors");
	 * messageSource.setDefaultEncoding("utf-8");
	 * return messageSource;
	 * }
	 */
}
