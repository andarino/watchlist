package com.springboot.watchlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import com.springboot.watchlist.consumer.ConsumerAPI;
import com.springboot.watchlist.model.MongoModel;
import com.springboot.watchlist.model.Result;

import java.util.List;

import com.springboot.watchlist.service.*;

@RestController
public class apiController{
	
	@Autowired
	private WatchlistService watchlistService; //cara que faz a conexao como o banco de dados
	
	ConsumerAPI consumerAPI;
	MongoModel mongoModel;

		@RequestMapping(value = "/minhaLista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ModelAndView minhaLista() {
	    	ModelAndView mv = new ModelAndView("minhaLista");	
	    	List<MongoModel> filmesDetails = watchlistService.FindAll();
	    	mv.setViewName("minhaLista");
	    	mv.addObject("filmesDetails", filmesDetails);
	        return mv;
	    } 
		//!!! this method should be GET !!!
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView consumerAPI() {
    	ModelAndView mv = new ModelAndView("home");	
    	//createFilmesRegister();
    	List<MongoModel> filmesDetails = watchlistService.FindAll();
    	mv.setViewName("home");
    	//mv.addObject("filmesDetails", filmesDetails);
        return mv;
    } 
	
    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView consumerAPI(@RequestParam("q") String q) {
    	ModelAndView mv = new ModelAndView("index");
    	List<Result> filmes = ConsumerAPI.ConnectAPI(q); 
    	mv.setViewName("buscarFilme");
        mv.addObject("obj", filmes);  
        return mv;
    } 
   
	//criando formulario para preencher os posts
	@RequestMapping(value = "/idx", method = RequestMethod.GET)
	public ModelAndView getPostForm() {
		ModelAndView mv = new ModelAndView("index");
		mv.setViewName("index");
		return mv;
	}
    
	@RequestMapping(value = "/idx", method = RequestMethod.POST)
	public String savePost(@ModelAttribute("mongoModel") MongoModel mongoModel)
	{
		//dadosCliente que vai salvar no banco response.getBody().getResults().get(i)
		System.out.println("espancando");
		System.out.println("mongoModel=> " + mongoModel.getTitulo());
		//filmesRepo.save(mongoModel); 
		return "buscarFilme";
	}
    
    
/*	void dadosCliente(String titulo, String urlPoster) {
        System.out.println("Data creation started..."); //VERIFIACAR SE AO RETIRAR O ID DÁ MERDA
        filmesRepo.save(new MongoModel(0, titulo, urlPoster));     
        System.out.println("Data creation complete...");
    }
*/

}
