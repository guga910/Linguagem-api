package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
//	https://github.com/abrahamcalf/programming-languages-logos/tree/master/src
	private String java= "https://github.com/abrahamcalf/programming-languages-logos/blob/master/src/java/java_256x256.png?raw=true";
	private String PHP= "https://github.com/abrahamcalf/programming-languages-logos/blob/master/src/php/php_256x256.png?raw=true";
	
	private List<Linguagem> linguagens= List.of(
			new Linguagem("Java", java, 1),
			new Linguagem("PHP", PHP, 2)
			);
	
//	http://localhost:8080/linguagens
	@GetMapping(value = "/linguagens")
	public List<Linguagem> obterLinguagens(){
		return linguagens;
	}
	

}
