package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Category;
import br.com.rd.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @PostMapping("/category")
    public Category save(@RequestBody Category category) {
        return repository.save(category);
    }

    @GetMapping("/category{id}")
    public Category findById(@PathVariable("id") Long idCategory){
        return repository.findById(idCategory).get();
    }

    @GetMapping("/category")
    public Category findCategoryById(@PathParam("id") Long id){
        return repository.findById(id).get();
    }

    @DeleteMapping("/category/{id}")
    public void deleteById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

    @PutMapping("/category")
    public ResponseEntity<Category> update(@RequestBody Category category){
        Category categoryEntity = repository.getOne(category.getCody());
        categoryEntity.setDescription(category.getDescription());
        Category categoryUpdate = repository.save(categoryEntity);
        return ResponseEntity.ok().body(categoryUpdate);
    }

    @PatchMapping("/category")
    public ResponseEntity<Category> updateEspecific(@RequestBody Category category) {
        Category categoryEntity = repository.getOne(category.getCody());
        categoryEntity.setDescription(category.getDescription());
        Category categoryUpdate = repository.save(categoryEntity);
        return ResponseEntity.ok().body(categoryUpdate);
    }
}
