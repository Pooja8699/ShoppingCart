package io.hng.starter.ProductMaster;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void addProducts(ProductMaster products) {
		productRepository.save(products);
	}
	
	public List<ProductMaster> getAllProducts(){
		List<ProductMaster> products = new ArrayList<>();
		productRepository.findAll()
		.forEach(products::add);
		return products;
	} 
}
