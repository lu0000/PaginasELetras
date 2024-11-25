package com.example.paginas_e_letras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paginas_e_letras.model.Cliente;
import com.example.paginas_e_letras.repository.IClienteRepository;

@Service
@Transactional(readOnly = false)
public class ClienteService {

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

    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> buscarPorId(Long id){
        return repository.findById(id);
    }
}
