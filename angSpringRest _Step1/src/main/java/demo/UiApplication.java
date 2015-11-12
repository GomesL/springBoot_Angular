package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UiApplication {

  @RequestMapping("/resource")
  public Map<Integer,Object> home() {
    Map<Integer,Object> model = new HashMap<Integer,Object>();
//    model.put("id", UUID.randomUUID().toString());
//    model.put("content", "Hello World 1");
    for (int i = 0; i < 5; i++) {
    	model.put(i,UUID.randomUUID().toString());
	}
    
    return model;
  }

  public static void main(String[] args) {
    SpringApplication.run(UiApplication.class, args);
  }

}