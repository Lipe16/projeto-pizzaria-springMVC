/**
 *Este property auxilia na hora de representar Objetos que 
 *est�o dentro de objeto, fazendo que o spring consiga trabalhar
 *com um objeto ao inves de ids para identificar
 *EX: PIZZA tem  INGREDIENTE na sua composi��o e para que tudo corra
 *bem na aplica��o � preciso que o spring trabalhe com o objeto
 *env�s do seu numero identificador 
 */
package br.com.filipe.pizzaria.propertyeditors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.filipe.pizzaria.modelo.entidades.Ingrediente;
import br.com.filipe.pizzaria.modelo.repositorios.IngredienteRepositorio;

@Component // para o spring conhecelo
public class IngredientePropertyEditor extends PropertyEditorSupport{
		@Autowired private IngredienteRepositorio ingredienteRepositorio;
	
		@Override
		public void setAsText(String text) throws IllegalArgumentException {
			long idIngrediente = Long.parseLong(text);
			Ingrediente ingrediente = ingredienteRepositorio.findOne(idIngrediente);
			//para setar o objeto em s�
			setValue(ingrediente);
		}
}
