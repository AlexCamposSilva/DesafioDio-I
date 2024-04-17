package com.dio.projetoservice.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.projeto.model.Cliente;
import com.dio.projeto.model.Endereco;
import com.dio.projeto.repository.ClienteRepository;
import com.dio.projeto.repository.EndereçoRepository;
import com.dio.projetoservice.ClienteService;
import com.dio.projetoservice.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

// Singleton: Injetar os componentes do Spring com @Autowired.

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EndereçoRepository endereçoRepository;

	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
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

		SalvarClienteComCep(cliente);
	}

	private void SalvarClienteComCep(Cliente cliente) {
		// Verificar se p Enmdereço do Cliente já existe (pelo Cep)
		String cep = cliente.getEndereço().getCep();
		Endereco endereco = endereçoRepository.findById(cep).orElseGet(() -> {

			// caso não exite integrar com ViaCep e persistir o retorno
			Endereco novoEndereço = viaCepService.consulEndereco(cep);
			endereçoRepository.save(novoEndereço);
			return novoEndereço;
		});

		cliente.setEndereço(endereco);
		// inserir CLiente, vinculando o Endereço (Novo ou existente).

		clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Long Id, Cliente cliente) {
		// Buscar Cliente por ID, caso exista;
		Optional<Cliente> clienteBd = clienteRepository.findById(Id);

		if (clienteBd.isPresent()) {
			SalvarClienteComCep(cliente); //Aproveitamos o método, ele faz tudo que se 
			//pede aqi embaixo.

		// Verificar se o Enedereço do CLiente já existe (pelo CEP);
		// Caso não exista, integrar com o ViaCeo e persistir o retorno.
		// Alterar Cliente, vinculando o Endereço (novo ou existente).

		}

	}

	@Override
	public void deletar(Long id) {
		// Deletar Cliente por ID.
		clienteRepository.deleteById(id);

	}
}

// Strategy: Implementar os métodos definidos na interface.
// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
