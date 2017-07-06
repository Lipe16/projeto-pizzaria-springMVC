package br.com.filipe.pizzaria.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.filipe.pizzaria.modelo.entidades.Usuario;

//repositorios precisa ser interface e não classe
public interface UsuarioRepositorio extends CrudRepository<Usuario,Long>{

	public Usuario findOneByLogin(String login);

}
