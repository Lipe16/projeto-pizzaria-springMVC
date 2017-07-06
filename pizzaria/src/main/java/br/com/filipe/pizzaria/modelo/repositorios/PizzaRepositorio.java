package br.com.filipe.pizzaria.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.filipe.pizzaria.modelo.entidades.Pizza;

//repositorios precisa ser interface e não classe
@Repository
public interface PizzaRepositorio extends CrudRepository<Pizza,Long>{

}
