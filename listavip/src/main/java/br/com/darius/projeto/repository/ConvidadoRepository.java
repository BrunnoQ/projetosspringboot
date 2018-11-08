package br.com.darius.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.darius.projeto.model.Convidado;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}