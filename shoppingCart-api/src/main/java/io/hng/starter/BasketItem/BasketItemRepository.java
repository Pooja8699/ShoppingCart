package io.hng.starter.BasketItem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BasketItemRepository extends CrudRepository<BasketItem, String>{
	
	public List<BasketItem> findByBigBasketId(int id);
}
