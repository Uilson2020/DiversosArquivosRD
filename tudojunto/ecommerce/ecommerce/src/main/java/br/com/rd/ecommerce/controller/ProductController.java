package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Product;
import br.com.rd.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return repository.save(product);
    }

    @PutMapping("/product")
    public Product update(@RequestBody Product product){
        Product productEntity = repository.getOne(product.getCodProduct());

        productEntity.setDescription(product.getDescription());
        productEntity.setVlProduct (product.getVlProduct());
        productEntity.setCategory (product.getCategory ());

        return repository.save(productEntity);
    }

    @GetMapping("/product")
    public ResponseEntity <Product> findProductById(@PathParam("id") Long id, @PathParam("description") String description){
        if(id != null && description != null)
            return ResponseEntity.ok().body(repository.findByCodProductAndDescription(id, description).get(0));
        else if (id != null)
            return ResponseEntity.ok().body(repository.findById(id).get());
        else if(description != null)
            return ResponseEntity.ok().body(repository.findByDescription(description).get(0));
        else
            return ResponseEntity.badRequest().build();
    }

    @GetMapping("/product/{description}")
    public List<Product> findByDescription(@PathVariable("description") String description){
        return repository.findByDescription(description);
    }


    @DeleteMapping("/product/{id}")
    public void deleteById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }
}

//    @DeleteMapping("/product/")
//    public void deleteProduct(@RequestBody Product product ){
//        repository.deleteProduct(product);
//    }
