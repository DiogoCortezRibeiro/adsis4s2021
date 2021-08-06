package br.unicesumar.adsis4s2021.meu.diogo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diogo-controller")
public class DiogoController {
	
	@GetMapping
	public String get()
	{
		return "Chegou no meu controller";
	}
}
