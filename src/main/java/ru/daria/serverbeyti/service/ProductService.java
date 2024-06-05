package ru.daria.serverbeyti.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.daria.serverbeyti.dao.ProductRepository;
import ru.daria.serverbeyti.dto.ProductDTO;
import ru.daria.serverbeyti.model.Product;

import java.util.List;

@Service
@AllArgsConstructor

public abstract class ProductService {
  @Autowired
    private  ProductRepository productRepository;


    public void saveProduct(){
        Product product = new Product();
        productRepository.save(product);

    }

    public void getProduct(int number, int volume){
    }

    public List<Product> readAll(){
        return productRepository.findAll();
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }


    public Product create(ProductDTO dto) {
     Product product = Product.builder()
             .name(dto.getName())
             .volume(dto.getVolume())
             .build();
     return productRepository.save(product);
    }
    public void delete(int id){
        productRepository.deleteById(id);
    }
}
