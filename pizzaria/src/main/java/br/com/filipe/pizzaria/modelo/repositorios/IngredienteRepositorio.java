package br.com.filipe.pizzaria.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.filipe.pizzaria.modelo.entidades.Ingrediente;

//repositorios precisa ser interface e n�o classe
@Repository
public interface IngredienteRepositorio extends CrudRepository<Ingrediente, Long>{

}
