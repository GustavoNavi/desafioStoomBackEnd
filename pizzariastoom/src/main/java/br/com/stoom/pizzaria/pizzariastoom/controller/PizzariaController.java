package br.com.stoom.pizzaria.pizzariastoom.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;

@Controller
public class PizzariaController<E> {

	@SuppressWarnings("unchecked")
	@ApiOperation(value = "Set type past of pizza")
	@RequestMapping(value = "/set-pastaType", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> setPastaType(HttpServletRequest servletRequest, @RequestBody Map<String, String> pastType)
	{
		
		List<String> list = new ArrayList<String>();
		
		list.add("Massa PAN");
		list.add("Massa Fininha");
		list.add("Massa Artezanale");
		list.add("Massa Siciliana");
		list.add("Massa Artezanale com Borda Cheddar");
		list.add("Massa Artezanale com Borda Requeijão");
		
		return (ResponseEntity<List<String>>) list;
		
	}
	
	@SuppressWarnings("unchecked")
	@ApiOperation(value = "Set size of pizza")
	@RequestMapping(value = "/set-pizzaSize", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> setSizePizza(HttpServletRequest servletRequest, @RequestBody Map<String, String> pizzaSize)
	{
		
		List<String> list = new ArrayList<String>();
		
		list.add("Pequena (1 Fatia)");
		list.add("Média (4 Fatias)");
		list.add("Grande (8 Fatias)");
		list.add("Família (12 Fatias)");
		
		return (ResponseEntity<List<String>>) list;
		
	}
	
	@SuppressWarnings("unchecked")
	@ApiOperation(value = "Set filling of pizza")
	@RequestMapping(value = "/set-pizzaFilling", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> setPizzaFilling(HttpServletRequest servletRequest, @RequestBody Map<String, String> pizzaFilling)
	{
		
		List<String> list = new ArrayList<String>();
		
		list.add("Calabresa com Cebola");
		list.add("Calabresa sem Cebola");
		list.add("Portuguesa");
		list.add("Frango com Catupiry");
		list.add("Muçarela");
		list.add("Napolitana");
		list.add("Brigadeiro");
		list.add("Romeu e Julieta");
		list.add("Creme de Avelã com Frutas");
		list.add("Califórnia");
		
		return (ResponseEntity<List<String>>) list;
		
	}
	
	@SuppressWarnings("unchecked")
	@ApiOperation(value = "Set side dish of pizza")
	@RequestMapping(value = "/set-pizzaSideDish", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> setPizzaSideDish(HttpServletRequest servletRequest, @RequestBody Map<String, String> pizzaSideDish)
	{
		
		List<String> list = new ArrayList<String>();
		
		list.add("Coca Cola 2L");
		list.add("Coca Cola 600ml");
		list.add("Guaraná 2L");
		list.add("Guaraná 600ml");
		list.add("Bata Frita (200g)");
		list.add("Cerveja Original 600ml");
		list.add("Cerveja Original 350ml");
		list.add("Espetinho de Carne");
		list.add("Patê de Frango");
		list.add("Salada de Alface");
		
		return (ResponseEntity<List<String>>) list;
		
	}
}
