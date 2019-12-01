package io.hng.starter.BasketItem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hng.starter.Basket.BasketRepository;

@Service
public class BasketItemService {

	@Autowired
	private BasketItemRepository basketItemRepository;
	
	
	public List<BasketItem> getAllItemsFromBasket(int basketId){
		List<BasketItem> items = new ArrayList<>();
		basketItemRepository.findByBigBasketId(basketId)
		.forEach(items::add);
		return items;
	}
	
	public BasketItem getItemFromBasket(String basketId) {
		return basketItemRepository.findOne(basketId);
	}
	
	public void addItemToBasket(BasketItem items) {
			basketItemRepository.save(items);
		
		}
	
	
	public void removeItemFromBasket(String productId) {
		basketItemRepository.delete(productId);
	}

	
}
