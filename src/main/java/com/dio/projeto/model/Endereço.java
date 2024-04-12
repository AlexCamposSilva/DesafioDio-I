package com.dio.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereço {

	/**
	 * Os atributos desse modelo foram gerados automaticamente pelo site
	 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
	 * 
	 * @see <a reef="https://www.jsonschema2pojo.org">jsonschema2pojo.org
	 * @see <a reef="https://viacep.com.br">ViaCEP 
	 * 
	 * @author AlexCampos
	 */
	
	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	
	
	public Endereço() {
		
	}
	
	
	public Endereço(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
			String ibge, String gia, String ddd, String siafi) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getIbge() {
		return ibge;
	}


	public void setIbge(String ibge) {
		this.ibge = ibge;
	}


	public String getGia() {
		return gia;
	}


	public void setGia(String gia) {
		this.gia = gia;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getSiafi() {
		return siafi;
	}


	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}
	
	
	
	
	
}
