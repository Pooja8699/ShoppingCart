package io.hng.starter.Basket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hng.starter.Basket.BasketRepository;
import io.hng.starter.BasketItem.BasketItem;


@Service
public class BasketService {
	
	@Autowired      // Dependency Injection
	private BasketRepository basketRepository;   
	
	public List<Basket> getAllBaskets() {
		List<Basket> baskets = new ArrayList<>();
		basketRepository.findAll()
		.forEach(baskets::add);
		return baskets;
	}
	
	public Basket getBasket(int userid) {
		return basketRepository.findOne(userid);
	}

	public Basket addBasket(Basket basket) {
		return basketRepository.save(basket);
	}
	
	public void deleteBasket(int id) {
		basketRepository.delete(id);
	}
	

}
