package com.dio.projetoservice;

import com.dio.projeto.model.Cliente;


public interface ClienteService {
	
	public Iterable <Cliente> buscarTodos ();

	public Cliente buscarPorId(Long Id);
	
	public void inserir (Cliente cliente);
	
	public void atualizar (Long Id, Cliente cliente);
	
	public void deletar (Long id);
}
