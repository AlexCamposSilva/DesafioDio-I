package com.dio.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.projeto.model.Endereco;


@Repository
public interface EndereçoRepository extends CrudRepository<Endereco, String>{

}
