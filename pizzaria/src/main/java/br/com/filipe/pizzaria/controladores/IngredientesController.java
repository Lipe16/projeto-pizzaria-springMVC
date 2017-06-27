package br.com.filipe.pizzaria.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.filipe.pizzaria.excecoes.IngredienteInvalidoException;
import br.com.filipe.pizzaria.modelo.entidades.Ingrediente;
import br.com.filipe.pizzaria.modelo.enumeracoes.CategoriaDeIngredientes;
import br.com.filipe.pizzaria.modelo.repositorios.IngredienteRepositorio;
import br.com.filipe.pizzaria.modelo.repositorios.PizzaRepositorio;

@Controller
@RequestMapping("/ingredientes")
public class IngredientesController {
	
	//as anotações @Autowired permitem que o Spring injete as dependências nesta classe
	@Autowired private IngredienteRepositorio ingredienteRepositorio;
	
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listarIngredientes(Model model){
		Iterable<Ingrediente> ingredientes = ingredienteRepositorio.findAll();
		
		// model passa objetos do controlador para a view
		model.addAttribute("titulo", "Listagem de ingredientes");
		model.addAttribute("ingredientes", ingredientes);
		model.addAttribute("categorias", CategoriaDeIngredientes.values());
		
		return "ingrediente/listagem";
	}
	
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarIngredientes(@Valid @ModelAttribute Ingrediente ingrediente, BindingResult bindingResult, Model model){

	
		System.out.println("id: "+ingrediente.getId());
		System.out.println("nome: "+ingrediente.getNome());
		System.out.println("categoria: "+ingrediente.getCategoria());
		
		 Ingrediente auxIngrediente = new Ingrediente();
		 /*
		if(ingrediente.getId() == 0){
				System.out.println("entrou na linha 53");
			 auxIngrediente.setNome(ingrediente.getNome());
			 auxIngrediente.setCategoria(ingrediente.getCategoria());
			
		}else{
			auxIngrediente = ingrediente;
		}
		*/
		 
		auxIngrediente = ingrediente;
		
		if(bindingResult.hasErrors()){
			
			throw new IngredienteInvalidoException();
			
			/*
			FieldError error = bindingResult.getFieldErrors().get(0);			
			redirectAtributes.addFlashAttribute("mensagemErro", "Não foi possivel salvar o ingrediente"+ error.getField() + " "+error.getDefaultMessage());
			*/
		}else{
			
			
			ingredienteRepositorio.save(auxIngrediente);
			Iterable<Ingrediente> ingredientes = ingredienteRepositorio.findAll();
			model.addAttribute("ingredientes", ingredientes);
			model.addAttribute("categorias", CategoriaDeIngredientes.values());
			
		
		}
		
		return "ingrediente/tabela-ingrediente";
	}
	
	
	
	
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> deletarIngrediente(@PathVariable Long id){
		try{
			ingredienteRepositorio.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody // printa uma string
	public Ingrediente buscarIngrediente(@PathVariable Long id){
		
			Ingrediente ingrediente = ingredienteRepositorio.findOne(id);
			return ingrediente;

		
	}


}
