package com.example.paginas_e_letras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.paginas_e_letras.model.Autor;
import com.example.paginas_e_letras.model.Cliente;
import com.example.paginas_e_letras.model.Compra;
import com.example.paginas_e_letras.model.Editora;
import com.example.paginas_e_letras.model.Estoque;
import com.example.paginas_e_letras.model.Financeiro;
import com.example.paginas_e_letras.model.Livro;
import com.example.paginas_e_letras.model.Venda;
import com.example.paginas_e_letras.service.AutorService;
import com.example.paginas_e_letras.service.ClienteService;
import com.example.paginas_e_letras.service.CompraService;
import com.example.paginas_e_letras.service.EditoraService;
import com.example.paginas_e_letras.service.EstoqueService;
import com.example.paginas_e_letras.service.FinanceiroService;
import com.example.paginas_e_letras.service.LivroService;
import com.example.paginas_e_letras.service.VendaService;

@SpringBootApplication
public class PaginasELetrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginasELetrasApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AutorService autorSer, ClienteService clienteSer, CompraService compraSer, EditoraService editoraSer, EstoqueService estoqueService, FinanceiroService financeiroSer, LivroService livroSer, VendaService vendaSer){
		return (args) -> {
			
			
			
			


		};

	}

}
