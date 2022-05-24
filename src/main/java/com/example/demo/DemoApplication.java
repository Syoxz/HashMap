package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	 @Bean
	  public CommandLineRunner demo(TestRepo repository, ItemRepo repo) {
	    return (args) -> {
	      // save a few customers
	      Order o = new Order ();
	      Item i = new Item ("Toast", 55);
	      Item i1 = new Item ("Schokolade", 100);
	      repo.save(i);
	      repo.save(i1);
	      
	      final Map <String, Item> map = new HashMap <> ();
	      map.put("Test", i);
	      map.put("Test2", i1);
	      o.setItemPriceMap(map);
	      repository.save(o);

};
	 }
}
