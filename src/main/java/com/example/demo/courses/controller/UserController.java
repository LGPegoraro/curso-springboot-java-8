package com.example.demo.courses.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//CAMADA DE CONTROLLER DEPENDE DA CAMADA DE SERVÇo

import com.example.demo.courses.domain.User;





@RestController
@RequestMapping (value = "/users")
public class UserController {
	
	
	// ResponseEntity retorna respostas de requisições web
	
	@GetMapping
	public ResponseEntity<User> findALL(){
		User u = new User(1L, "lucas","lucas@hotmail.com","12345678910" , "123");
		return ResponseEntity.ok().body(u);
		
	}
	
	
	
	
		
		

}
