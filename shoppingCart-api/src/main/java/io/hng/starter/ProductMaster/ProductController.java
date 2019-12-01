package io.hng.starter.ProductMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST, value="/products")
	public void addProducts(@RequestBody ProductMaster products) {
		productService.addProducts(products);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/products")
	public List<ProductMaster> getAllProducts(){
		return productService.getAllProducts();
	}

}
