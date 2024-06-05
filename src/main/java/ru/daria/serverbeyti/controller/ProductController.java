package ru.daria.serverbeyti.controller;


import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.daria.serverbeyti.dto.ProductDTO;
import ru.daria.serverbeyti.model.Product;
import ru.daria.serverbeyti.service.ProductService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {


    private final ProductService productService;

    @GetMapping("/id")
    public Integer getProduct(@RequestParam Integer shade_number, @RequestParam Integer volume) {
        productService.saveProduct();
        return volume;
    }

@PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO dto) {
    return new ResponseEntity<>(productService.create(dto),HttpStatus.OK);
}

@GetMapping
    public ResponseEntity<List<Product>>readAll(){
    return new ResponseEntity<>(productService.readAll(), HttpStatus.OK);
}
@PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product)
{
    return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.OK);
}
@DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Integer id) {
        productService.delete(id);
        return HttpStatus.OK;
}
    }

