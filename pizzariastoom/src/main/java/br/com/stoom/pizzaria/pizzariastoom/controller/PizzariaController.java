package br.com.stoom.pizzaria.pizzariastoom.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="request")
public class PizzariaController<E, T> 
{

	@ApiOperation(value = "Get type past of pizza")
	@RequestMapping(value = "/get-pastaType", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getPastaType(HttpServletRequest req)
	{
		
		List<String> pastaTypeList = new ArrayList<String>();
		
		pastaTypeList.add("Massa PAN");
		pastaTypeList.add("Massa Fininha");
		pastaTypeList.add("Massa Artezanale");
		pastaTypeList.add("Massa Siciliana");
		pastaTypeList.add("Massa Artezanale com Borda Cheddar");
		pastaTypeList.add("Massa Artezanale com Borda Requeijão");

		String json = new Gson().toJson(pastaTypeList);
		
		return new ResponseEntity<>(json, HttpStatus.OK);
		
	}
	

	@ApiOperation(value = "Get size of pizza")
	@RequestMapping(value = "/get-pizzaSize", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getSizePizza()
	{
		
		List<String> pizzaSizeList = new ArrayList<String>();
		
		pizzaSizeList.add("Pequena (1 Fatia)");
		pizzaSizeList.add("Média (4 Fatias)");
		pizzaSizeList.add("Grande (8 Fatias)");
		pizzaSizeList.add("Família (12 Fatias)");
		
		String json = new Gson().toJson(pizzaSizeList);
		return new ResponseEntity<>(json, HttpStatus.OK);
		
	}
	

	@ApiOperation(value = "Get filling of pizza")
	@RequestMapping(value = "/get-pizzaFilling", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getPizzaFilling()
	{
		
		List<String> pizzaFillingList = new ArrayList<String>();
		
		pizzaFillingList.add("Calabresa com Cebola");
		pizzaFillingList.add("Calabresa sem Cebola");
		pizzaFillingList.add("Portuguesa");
		pizzaFillingList.add("Frango com Catupiry");
		pizzaFillingList.add("Muçarela");
		pizzaFillingList.add("Napolitana");
		pizzaFillingList.add("Brigadeiro");
		pizzaFillingList.add("Romeu e Julieta");
		pizzaFillingList.add("Creme de Avelã com Frutas");
		pizzaFillingList.add("Califórnia");
		
		String json = new Gson().toJson(pizzaFillingList);
		return new ResponseEntity<>(json, HttpStatus.OK);
		
	}
	
	@ApiOperation(value = "Get side dish of pizza")
	@RequestMapping(value = "/get-pizzaSideDish", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getPizzaSideDish()
	{
		
		List<String> pizzaSideDishList = new ArrayList<String>();
		
		pizzaSideDishList.add("Coca Cola 2L");
		pizzaSideDishList.add("Coca Cola 600ml");
		pizzaSideDishList.add("Guaraná 2L");
		pizzaSideDishList.add("Guaraná 600ml");
		pizzaSideDishList.add("Bata Frita (200g)");
		pizzaSideDishList.add("Cerveja Original 600ml");
		pizzaSideDishList.add("Cerveja Original 350ml");
		pizzaSideDishList.add("Espetinho de Carne");
		pizzaSideDishList.add("Patê de Frango");
		pizzaSideDishList.add("Salada de Alface");
		
		String json = new Gson().toJson(pizzaSideDishList);
		return new ResponseEntity<>(json, HttpStatus.OK);
		
	}
	
	@ApiOperation(value = "Get the Pizza of the Day")
	@RequestMapping(value = "/get-pizzaOfDay", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getPizzaOfDay()
	{
		boolean hasError = false;
		List<String> pizzaOfDay = new ArrayList<String>();
		
		int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
		
		switch(dayOfWeek)
		{
			//Monday
			case 1:
				pizzaOfDay.add("Tipo da Massa: Massa PAN");
				pizzaOfDay.add("Tamanho da Pizza: Grande (8 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Calabresa com Cebola");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 20");
				break;
			
			//Tuesday
			case 2:
				pizzaOfDay.add("Tipo da Massa: Massa Fininha");
				pizzaOfDay.add("Tamanho da Pizza: Grande (8 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Portuguesa");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 20");
				break;
			
			//Wednesday
			case 3:
				pizzaOfDay.add("Tipo da Massa: Massa Artezanale");
				pizzaOfDay.add("Tamanho da Pizza: Grande (8 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Muçarela");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 10");
				break;
			
			//Thursday	
			case 4:
				pizzaOfDay.add("Tipo da Massa: Massa Siciliana");
				pizzaOfDay.add("Tamanho da Pizza: Grande (8 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Napolitana");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 10");
				break;
				
			//Friday
			case 5:
				pizzaOfDay.add("Tipo da Massa: Massa Artezanale");
				pizzaOfDay.add("Tamanho da Pizza: Grande (8 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Frango com Catupiry");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 10");
				break;
				
			//Saturday
			case 6:
				pizzaOfDay.add("Tipo da Massa: Massa Artezanale com Borda Cheddar");
				pizzaOfDay.add("Tamanho da Pizza: Família (12 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Califórnia");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 15");
				break;
				
			//Sunday
			case 7:
				pizzaOfDay.add("Tipo da Massa: Massa Artezanale com Borda Requeijão");
				pizzaOfDay.add("Tamanho da Pizza: Família (12 Fatias)");
				pizzaOfDay.add("Sabor da Pizza: Romeu e Julieta");
				pizzaOfDay.add("Pontos ao adquirir esta pizza: 15");
				break;
			
			default:
				hasError = true;
				
		}
		
		if(hasError)
		{
			return new ResponseEntity<>("Internal Server Error!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		String json = new Gson().toJson(pizzaOfDay);
		return new ResponseEntity<>(json, HttpStatus.OK);
	}
	
}
