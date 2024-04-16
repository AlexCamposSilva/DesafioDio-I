package com.dio.projetoservice.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.projeto.model.Cliente;
import com.dio.projeto.repository.ClienteRepository;
import com.dio.projeto.repository.EndereçoRepository;
import com.dio.projetoservice.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
// Singleton: Injetar os componentes do Spring com @Autowired.

	@Autowired
	private ClienteRepository clienteRepository;
	
	private EndereçoRepository endereçoRepository;

	@Override
	public Iterable<Cliente> buscartodos() {
		// Buscar todos os Clientes.
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long Id) {
		// Buscar Cliente por ID.
		Optional<Cliente> cliente = clienteRepository.findById(Id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		// TODO Auto-generated method stub
		//salvarcliemcep.
		
	}

	@Override
	public void atualizar(Long Id, Cliente cliente) {
		// Buscar Cliente por ID, caso exista:
		
		
	}

	@Override
	public void deletar(Long id) {
		// Deletar Cliente por ID.
		
	}
	
	
	// Strategy: Implementar os métodos definidos na interface.
		// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	
