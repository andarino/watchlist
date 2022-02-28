package com.springboot.watchlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import com.springboot.watchlist.consumer.ConsumerAPI;
import com.springboot.watchlist.model.MongoModel;
import com.springboot.watchlist.model.Result;
import java.util.List;
import com.springboot.watchlist.service.*;

@Controller
public class apiController{
	
	@Autowired
	WatchlistService watchlistService; //cara que faz a conexao como o banco de dados
	ConsumerAPI consumerAPI;

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
    	
    	//passar o result para mongoModel
    	List<MongoModel> mm = null;
    	mv.setViewName("buscarFilme");
        mv.addObject("obj", filmes);  
        return mv;
    } 
    
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String salvarCLI(@ModelAttribute MongoModel mm, @RequestParam(name = "titulo") String titulo ) {
    	ModelAndView mv = new ModelAndView("index");
    	mv.addObject("mm", mm);
    	System.out.println("abuso -> "+titulo);
    	System.out.println("mongoModel-titulo => "+ mm.getTitulo()+ "||" +mm.getPoster());
    	return "redirect:/minhaLista";
    }
   
    
	//criando formulario para preencher os posts
	@RequestMapping(value = "/idx", method = RequestMethod.GET)
	public ModelAndView getPostForm() {
		ModelAndView mv = new ModelAndView("a");
		mv.setViewName("a");
		return mv;
	}
    
	@RequestMapping(value = "/idx", method = RequestMethod.POST)
	public String savePost(@ModelAttribute MongoModel mm)
	{
		//dadosCliente que vai salvar no banco response.getBody().getResults().get(i)
		System.out.println("espancando");
		System.out.println("mongoModel => "+ mm.getClass() +" "+ mm.getPoster());
		//filmesRepo.save(mongoModel); 
		return "buscarFilme";
	}


}
