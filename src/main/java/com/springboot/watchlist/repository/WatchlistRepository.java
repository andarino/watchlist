package com.springboot.watchlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.watchlist.model.*;

public interface WatchlistRepository extends JpaRepository<MongoModel, Long>{

}
