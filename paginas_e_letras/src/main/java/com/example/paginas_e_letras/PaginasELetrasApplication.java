package com.example.paginas_e_letras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


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
			
			//PRIMEIRA:

			/*Autor a1 = new Autor();
			a1.setNome_autor("Holly Black");
			autorSer.salvar(a1);

			Editora e1 = new Editora();
			e1.setNome("Editora Galera");
			e1.setTelefone("(81) 9 7858-2587");
			editoraSer.salvar(e1);

			Estoque est1 = new Estoque();
			est1.setQuant_produto(25);
			estoqueService.salvar(est1);

			Cliente cli1 = new Cliente();
			cli1.setNome("Emy Nathally");
			cli1.setCpf("044.741.785-98");
			cli1.setCelular("(77) 9 9 8524-4348");
			cli1.setEndereço("Rua de ladrilhos, Bairro São, 108, Casa");
			cli1.setEmail("emy1@gmail.com");
			clienteSer.salvar(cli1);

			Livro l1 = new Livro();
			l1.setTitulo("O Príncipe Cruel");
			l1.setIsbn("9788501115553");
			l1.setValor(41);
			l1.setGenero("Fantasia");
			l1.setAutor(a1);
			l1.setEditora(e1);
			l1.setEstoque(est1);
			livroSer.salvar(l1);*/
			

			//SEGUNDO PARTE
			/*Cliente a1 = clienteSer.buscarPorId(2L);
			Livro l1 = livroSer.buscarPorId(2L);

			Compra compra1 = new Compra();
			compra1.setDescrição_compra("Preenchimento Estoque");
			compra1.setValor_total(15000.00);
			compraSer.salvar(compra1);
			
			Venda venda1 = new Venda();
			venda1.setDescrição_produto("Livro Fantasia");
			venda1.setForma_de_pagamento("Cartão de crédito");
			venda1.setDesconto(0);
			venda1.setValor_bruto(41.00);
			venda1.setValor_liquido(41.00);
			venda1.setClientes(a1);
			venda1.setLivros(l1);
			vendaSer.salvar(venda1);

			Financeiro f1 = new Financeiro();
			f1.setDescricao("Estoque");
			f1.setSaida(15000.00);
			f1.setEntrada(0);
			f1.setValor_caixa(-15000.00);
			f1.setCompras(compra1);
			financeiroSer.salvar(f1);

			Financeiro f2 = new Financeiro();
			f2.setDescricao("Venda Livros");
			f2.setEntrada(41);
			f2.setSaida(0);
			f2.setValor_caixa(41);
			f2.setVendas(venda1);
			financeiroSer.salvar(f2);*/

			//TESTANDO OS OUTROS MÉTODOS
			//livroSer.retira_estoque(1L, 1);
			//livroSer.adiciona_estoque(2L, 10);;
			//livroSer.buscarPorTitulo("Jogos Vorazes I");
			//clienteSer.buscarPorNome("Emy Nathally");
		};

	}

}
