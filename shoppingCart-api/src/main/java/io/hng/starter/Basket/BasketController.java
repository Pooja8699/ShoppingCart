package io.hng.starter.Basket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.hng.starter.Basket.BasketService;
import io.hng.starter.UserProfile.UserProfile;

@RestController
public class BasketController {
	
	 @Autowired
	  private BasketService basketService;
	 
	 
	 @RequestMapping("/users/baskets")
	 public List<Basket> getAllBaskets(){
		 return basketService.getAllBaskets();
	 }
	
	 @RequestMapping(method = RequestMethod.GET, value="/users/{userId}/baskets")
	 public Basket getBasket(@PathVariable int userId) {
		 return basketService.getBasket(userId);
	 }
	
	 @RequestMapping(method= RequestMethod.POST, value= "/users/{userId}/baskets")
	public Basket addBasket(@RequestBody Basket basket, @PathVariable int userId) {
		 basket.setUserInfo(new UserProfile(userId));
		return basketService.addBasket(basket);
	}
	 
	 @RequestMapping(method = RequestMethod.DELETE, value= "/users/{userId}/baskets/{id}")
	 public void deleteBasket(@PathVariable int id)
	 {
		 basketService.deleteBasket(id);
	 }
	 
}
