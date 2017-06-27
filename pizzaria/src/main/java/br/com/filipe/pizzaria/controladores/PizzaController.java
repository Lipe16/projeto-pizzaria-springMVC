package br.com.filipe.pizzaria.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
import br.com.filipe.pizzaria.modelo.repositorios.PizzaRepositorio;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
	
	@Autowired private PizzaRepositorio pizzaRepositorio;
	
	

	
	@RequestMapping(method=RequestMethod.GET)
	public String listarPizzas(Model model){
		Iterable<Pizza> pizzas = pizzaRepositorio.findAll();
		
		model.addAttribute("titulo", "Listagem de pizzas");
		model.addAttribute("pizzas", pizzas);
		model.addAttribute("categorias", CategoriaDePizza.values());
		
		return "pizza/listagem";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarPizzas(@Valid @ModelAttribute Pizza pizza, BindingResult bindingResult, Model model){
	
		System.out.println("id: "+pizza.getId());
		System.out.println("nome: "+pizza.getNome());
		System.out.println("categoria: "+pizza.getCategoria());
		
		Pizza auxPizza = new Pizza();
		if( pizza.getId() == 0){		
			 auxPizza.setNome(pizza.getNome());
			 auxPizza.setPreco(pizza.getPreco());
			 auxPizza.setCategoria(pizza.getCategoria());
			
		}else{
			auxPizza = pizza;
		}
		
		
		
		if(bindingResult.hasErrors()){
			
			throw new IngredienteInvalidoException();
			
		}else{
						
			pizzaRepositorio.save(auxPizza);
			Iterable<Pizza> pizzas = pizzaRepositorio.findAll();
			model.addAttribute("pizzas", pizzas);
			model.addAttribute("categorias", CategoriaDePizza.values());
						
		}
		
		return "pizza/tabela-pizza";
	}
	
	/*
	@RequestMapping("/ola/{nome}")
	@ResponseBody
	public String ola(@PathVariable String nome){
		
		return "ola "+nome;
	}
	*/

}
