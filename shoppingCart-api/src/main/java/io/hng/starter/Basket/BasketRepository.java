package io.hng.starter.Basket;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface BasketRepository extends CrudRepository<Basket, Integer> {
	
	public Basket findById(int id);
	

}
