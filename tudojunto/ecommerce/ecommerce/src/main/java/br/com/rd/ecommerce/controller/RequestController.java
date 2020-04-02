package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.dto.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.rd.ecommerce.service.RequestService;

@RestController
public class RequestController {

    @Autowired
    RequestService service;

    @PostMapping("/request")
    public ResponseEntity saveRequest(@RequestBody RequestDTO request){
        return service.save(request);
    }
}
