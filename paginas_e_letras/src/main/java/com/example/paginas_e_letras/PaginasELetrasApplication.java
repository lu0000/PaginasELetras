package com.example.paginas_e_letras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.paginas_e_letras.model.Livro;
import com.example.paginas_e_letras.service.AutorService;
import com.example.paginas_e_letras.service.ClienteService;
import com.example.paginas_e_letras.service.CompraService;
import com.example.paginas_e_letras.service.EditoraService;
import com.example.paginas_e_letras.service.EstoqueService;
import com.example.paginas_e_letras.service.FinanceiroService;
import com.example.paginas_e_letras.service.LivroService;

@SpringBootApplication
public class PaginasELetrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginasELetrasApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AutorService autorSer, ClienteService clienteSer, CompraService compraSer, EditoraService editoraSer, EstoqueService estoqueService, FinanceiroService financeiroSer, LivroService livroSer){
		return (args) -> {
			Livro l1 = new Livro();
			/*l1.setGenero("Romance");
			l1.setIsbn("123456789");
			l1.setTitulo("Cool for the Summer");
			l1.setValor(24.20);
			livroSer.save(l1);*/
			
		};

	}

}
