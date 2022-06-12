package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAll")
	public List<Product> getAllProducts(){
		return this.productService.getAllProducts();
	}
	
	@GetMapping("/getById/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return this.productService.getProductById(id);
	}
	
	@GetMapping("/getByName/{name}")
	public Product getProductByName(@PathVariable("name") String name) {
		return this.productService.getProductByName(name);
	}
	
	@PostMapping("/saveProduct")
	public Product addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}
	
	@PostMapping("/saveProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return this.productService.addProducts(products);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProductById(@PathVariable("id") int id) {
		this.productService.deleteProductById(id);
	}
	

	
	
	
	
	

}
