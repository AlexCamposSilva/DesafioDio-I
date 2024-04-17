package com.dio.projetoservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dio.projeto.model.Endereco;


/**
 * Client HTTP, criado via OpenFeign, para o consumo da API do
 * ViaCEP.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign
 * @see <a href="https://viacep.com.br">ViaCEP
 * 
 * @author falvojr
 */


@FeignClient(name = "viacep", url = "https://viacep.com.br/ws" )
public interface ViaCepService {
	
	@GetMapping ("/{cep}/json/")
	Endereco consulEndereco (@PathVariable("cep") String cep);
	

}
