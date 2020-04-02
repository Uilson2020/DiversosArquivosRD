package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Category;
import br.com.rd.ecommerce.model.NF;
import br.com.rd.ecommerce.repository.CategoryRepository;
import br.com.rd.ecommerce.repository.NFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NFController {
    @Autowired
    private NFRepository Repository;

    @PostMapping("/nf")
    public NF save(@RequestBody NF nf ) {
        return Repository.save(nf);
    }
}
