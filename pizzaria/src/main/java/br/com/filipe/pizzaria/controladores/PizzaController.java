package br.com.filipe.pizzaria.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.filipe.pizzaria.excecoes.IngredienteInvalidoException;
import br.com.filipe.pizzaria.modelo.entidades.Ingrediente;
import br.com.filipe.pizzaria.modelo.entidades.Pizza;
import br.com.filipe.pizzaria.modelo.enumeracoes.CategoriaDeIngredientes;
import br.com.filipe.pizzaria.modelo.enumeracoes.CategoriaDePizza;
import br.com.filipe.pizzaria.modelo.repositorios.IngredienteRepositorio;
import br.com.filipe.pizzaria.modelo.repositorios.PizzaRepositorio;
import br.com.filipe.pizzaria.propertyeditors.IngredientePropertyEditor;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
	//as anota��es @Autowired permitem que o Spring injete as depend�ncias nesta classe
	@Autowired private PizzaRepositorio pizzaRepositorio;
	@Autowired private IngredienteRepositorio ingredienteRepositorio;
	@Autowired private IngredientePropertyEditor ingredientePropertyEditor;
	

	
	@RequestMapping(method=RequestMethod.GET)
	public String listarPizzas(Model model){
		Iterable<Pizza> pizzas = pizzaRepositorio.findAll();
		
		// model passa objetos do controlador para a view
		model.addAttribute("titulo", "Listagem de pizzas");
		model.addAttribute("pizzas", pizzas);
		model.addAttribute("categorias", CategoriaDePizza.values());
		model.addAttribute("ingredientes", ingredienteRepositorio.findAll());
		
		return "pizza/listagem";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarPizzas(@Valid @ModelAttribute Pizza pizza, BindingResult bindingResult, Model model){
	
		System.out.println("id: "+pizza.getId());
		System.out.println("nome: "+pizza.getNome());
		System.out.println("categoria: "+pizza.getCategoria());
		System.out.println("Ingrediente: "+pizza.getIngredientes());
		

	
		
		
		if(bindingResult.hasErrors()){
			
			throw new IngredienteInvalidoException();
			
		}else{
						
			pizzaRepositorio.save(pizza);
			Iterable<Pizza> pizzas = pizzaRepositorio.findAll();
			model.addAttribute("pizzas", pizzas);
						
		}
		
		return "pizza/tabela-pizza";
	}
	
	//este binder cuida para que toda vez que um ingrediente for usado
	//ele usar� um objeto ao env�s de um id identificador
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.registerCustomEditor(Ingrediente.class, ingredientePropertyEditor);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> deletarIngrediente(@PathVariable Long id){
		try{
			pizzaRepositorio.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody // printa uma string
	public Pizza buscarPizza(@PathVariable Long id){
		
			Pizza pizza = pizzaRepositorio.findOne(id);
			return pizza;

		
	}
	
	
	/*
	@RequestMapping("/ola/{nome}")
	@ResponseBody
	public String ola(@PathVariable String nome){
		
		return "ola "+nome;
	}
	*/

}
