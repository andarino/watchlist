package com.springboot.watchlist.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.watchlist.model.MongoModel;
import com.springboot.watchlist.model.Result;
import com.springboot.watchlist.repository.WatchlistRepository;
import com.springboot.watchlist.service.WatchlistService;

@Service  
public class WatchlistServiceImpl implements WatchlistService{

	@Autowired
	WatchlistRepository watchlistRepo;

	@Override
	public List<MongoModel> FindAll() {
		return watchlistRepo.findAll();
	}

	@Override
	public MongoModel findById(long id) {
		return watchlistRepo.findById(id).get();
	}

	public MongoModel save(MongoModel mm) {	
		return watchlistRepo.save(mm);
	}
	
}
