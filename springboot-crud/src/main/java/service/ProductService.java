package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return this.productRepository.findAll();
	}
	
	public Product getProductById(int id) {
		return this.productRepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return this.productRepository.findByName(name);
	}
	
	public Product addProduct(Product product) {
		return this.productRepository.save(product);
	}
	
	public List<Product> addProducts(List<Product> products){
		return this.productRepository.saveAll(products);
	}
	
	public void deleteProductById(int id) {
		this.productRepository.deleteById(id);
		
	}
	

	
	

}
