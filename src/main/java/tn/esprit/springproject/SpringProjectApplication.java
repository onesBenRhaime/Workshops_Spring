package tn.esprit.springproject;

import entities.Bloc;
import entities.Chambre;
import entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "entities")
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
		Bloc bloc1= new Bloc(123L,"Bloc C",1256L);
		System.out.println("constractor :  "+bloc1);
	}

}
