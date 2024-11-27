package com.example.paginas_e_letras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.paginas_e_letras.model.Autor;
import com.example.paginas_e_letras.model.Cliente;
import com.example.paginas_e_letras.model.Editora;
import com.example.paginas_e_letras.model.Estoque;
import com.example.paginas_e_letras.model.Livro;
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
			
			/*l1.setGenero("Romance");
			l1.setIsbn("123456789");
			l1.setTitulo("Cool for the Summer");
			l1.setValor(24.20);
			livroSer.save(l1);*/
			/*livroSer.excluirPorId(1L);
			System.out.println(livroSer.buscarPorId(1L));
			System.out.println(livroSer.buscarPorTitulo("Jogos Vorazes"));*/
			
			
			
			Autor a1 = new Autor();
			a1.setNome_autor("Suzanne Collins");

			clienteSer.excluirPorId(1L);
			Editora e1 = new Editora();
			e1.setNome("Editora Rocco");
			e1.setTelefone("(81) 9 9958-2587");

			Estoque est1 = new Estoque();
			est1.setQuant_produto(14);

			Cliente cli1 = new Cliente();
			cli1.setNome("Luana Cerqueira");
			cli1.setCpf("044.568.475-78");
			cli1.setCelular("(77) 9 9 9966-4348");
			cli1.setEndereco("Rua das Pedrinhas, Bairro Jesus, 108, Casa");
			cli1.setEmail("luanacerqueira7766@gmail.com");

			/*autorSer.salvar(a1);
			editoraSer.salvar(e1);
			estoqueService.salvar(est1);
			clienteSer.salvar(cli1);*/

			Livro l1 = new Livro();
			l1.setTitulo("Jogos Vorazes I");
			l1.setIsbn("123145658");
			l1.setValor(32.25);
			l1.setGenero("Distópia");
			l1.setAutor(a1);
			l1.setEditora(e1);
			l1.setEstoque(est1);
			//l1.setCliente(List<cli1>);

			livroSer.salvar(l1);


		};

	}

}
