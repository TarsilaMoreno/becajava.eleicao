package br.eleicao.app.repository;

import org.springframework.stereotype.Repository;
import br.eleicao.app.model.Municipio;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface MunicipioRepository extends CrudRepository<Municipio, Long> {

}
