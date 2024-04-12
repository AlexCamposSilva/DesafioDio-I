package com.dio.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.projeto.model.Endereço;


@Repository
public interface EndereçoRepository extends CrudRepository<Endereço, String>{

}
