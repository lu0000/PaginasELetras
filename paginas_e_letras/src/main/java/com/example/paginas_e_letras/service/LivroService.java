package com.example.paginas_e_letras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Estoque;
import com.example.paginas_e_letras.model.Livro;
import com.example.paginas_e_letras.repository.ILivroRepository;

@Service
@Transactional(readOnly = false)
public class LivroService {
    @Autowired
    private ILivroRepository repository;

    public void salvar(Livro livro){
            try { //Tratamento de Exceção
                System.out.println("Tentando salvar o livro: " + livro.getTitulo());
                Livro l = repository.save(livro);
                System.out.println("Livro salvo com sucesso: " + l.getId());
            } catch (Exception e) {
                System.err.println("Erro ao salvar o livro: " + e.getMessage());
            }
        }

    public void editar(Livro livro){
            repository.save(livro);
        }

    public void excluir(Livro livro){
            try{
                repository.delete(livro);
                System.out.println("Livro" + livro.getTitulo() + "excluido com sucesso!");
            } catch(Exception e){
                System.err.println("Não foi possível excluir o livro!");
            }
        }

    public void excluirPorId(Long id){
            try{
                System.out.println("Excluindo Livro identificado com o código: " + id);
                repository.deleteById(id);
                System.out.println("Livro excluido com sucesso!");
            }catch(Exception e){
                System.err.println("Não foi possível excluir o livro!");
            }
            
        }

    @Transactional(readOnly = true)
    public List<Livro> buscarTodos(){
            //System.out.println("Buscando todos os Livros cadastrados.");
            return repository.findAll();
        }

    @Transactional(readOnly = true)
    public Livro buscarPorId(Long id){
        System.out.println("Buscando Livro com o código " + id);
        return repository.findById(id).orElse(null);
        
        /*Livro livro = repository.findById(id).orElse(null);
        System.out.println("Detalhes do Livro:");
        System.out.println("ID: " + livro.getId());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Valor: " + livro.getValor());
        System.out.println("Autor: " + (livro.getAutor()));
        System.out.println("Editora: " + (livro.getEditora()));
        System.out.println("Estoque: " + (livro.getEstoque()));
        return repository.findById(id).orElse(null);*/
            
    }
    
    @Transactional(readOnly = true)
    public Livro buscarPorTitulo(String titulo){
        Livro livro = repository.findByTitulo(titulo);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro.getTitulo() + " | Valor: " + livro.getValor() + "| Quantidade: " + livro.getEstoque().getQuant_produto() );
        } else {
            System.out.println("Nenhum livro encontrado com o título: " + titulo);
        }
        return livro;
    }
    
    public void retira_estoque(Long id_livro, int quant){
    // Buscar o livro pelo ID --> .orElseThrow() para lançar uma exceção caso o ID não exista
    Livro livro = repository.findById(id_livro).orElseThrow(() -> new RuntimeException("Livro com código " + id_livro + " não encontrado."));
    // Obter o estoque associado ao livro
    Estoque estoque = livro.getEstoque();
    // Verificar se há quantidade suficiente no estoque
    if (estoque.getQuant_produto() >= quant) {
        // Atualizar a quantidade no estoque
        estoque.setQuant_produto(estoque.getQuant_produto() - quant);
        repository.save(livro);
        System.out.print("Estoque atualizado! Quantidade atual: " + estoque.getQuant_produto());
    }else{
        System.out.print("Estoque insuficiente. Quantidade disponível: " + estoque.getQuant_produto());
    }
    
    }

    public void adiciona_estoque(Long id_livro, int quant){
        Livro livro = repository.findById(id_livro).orElseThrow(() -> new RuntimeException("Livro com ID " + id_livro + " não encontrado."));
        Estoque estoque = livro.getEstoque();
        estoque.setQuant_produto(estoque.getQuant_produto() + quant);
        repository.save(livro);
        System.out.print("Estoque atualizado! Quantidade atual: " + estoque.getQuant_produto());
    }

}
