package io.hng.starter.BasketItem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.hng.starter.Basket.Basket;
import io.hng.starter.Basket.BasketRepository;

@RestController
public class BaskteItemController {
	
	@Autowired
	private BasketItemService basketItemService;
	
		
	@RequestMapping(method = RequestMethod.GET , value= "/baskets/{basketId}/items")
	public List<BasketItem> getAllItemsFromBasket(@PathVariable int basketId){
		return basketItemService.getAllItemsFromBasket(basketId);
	}
		
	@RequestMapping(method = RequestMethod.PUT, value ="/baskets/{basketId}/items")
	public void addItemToBasket(@RequestBody BasketItem item, @PathVariable int basketId) {
		item.setBasket(new Basket(basketId));
		basketItemService.addItemToBasket(item);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/baskets/{basketId}/items/{productId}")
	public void removeItemFromBasket(@PathVariable int basketId, @PathVariable String productId) {
		basketItemService.removeItemFromBasket(productId);
	}

}
