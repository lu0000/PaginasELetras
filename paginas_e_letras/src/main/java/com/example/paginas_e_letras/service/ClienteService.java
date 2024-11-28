package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Autor;
import com.example.paginas_e_letras.model.Cliente;
import com.example.paginas_e_letras.repository.IClienteRepository;

@Service
@Transactional(readOnly = false)
public class ClienteService {
    @Autowired
    private IClienteRepository repository;

    public void salvar(Cliente cliente){
        repository.save(cliente);
    }

    public void editar(Cliente cliente){
        repository.save(cliente);
    }

    public void excluir(Cliente cliente){
        repository.delete(cliente);
    }

    public void excluirPorId(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Cliente buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public Cliente buscarPorNome(String nome){
        Cliente cliente = repository.findByNome(nome);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNome() + " | CPF: " + cliente.getCpf() + "| Telefone: " + cliente.getCelular());
        } else {
            System.out.println("Nenhum cliente encontrado com o nome: " + cliente);
        }
        return cliente;
    }
}
