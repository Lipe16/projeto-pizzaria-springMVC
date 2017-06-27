package br.com.filipe.pizzaria.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.filipe.pizzaria.modelo.enumeracoes.CategoriaDeIngredientes;

@Entity
public class Ingrediente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	@Enumerated(EnumType.STRING)//hibernate salve isso como string e não como integer que seria o padrão
	private CategoriaDeIngredientes categoria;
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaDeIngredientes getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDeIngredientes categoria) {
		this.categoria = categoria;
	}
	
	
	
}
