package com.springboot.watchlist.service;

import com.springboot.watchlist.model.MongoModel;

import java.util.List;

public interface WatchlistService {
	List<MongoModel> FindAll();
	MongoModel findById(long id); //retorna um unico post
	MongoModel save(MongoModel filmes);

}
