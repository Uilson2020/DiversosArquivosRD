package br.com.rd.ecommerce.service;

import br.com.rd.ecommerce.model.ItemRequest;
import br.com.rd.ecommerce.model.Request;
import br.com.rd.ecommerce.repository.RequestRepository;
import br.com.rd.ecommerce.model.dto.ItemRequestDTO;
import br.com.rd.ecommerce.model.dto.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("RequestService")
public class RequestService {

    @Autowired
    RequestRepository repository;

    public ResponseEntity save(RequestDTO requestDTO){
        //todo incluir validaçoes
        if(requestDTO == null || requestDTO.getIdClient() == null)
            return ResponseEntity.badRequest().body(new Exception("Cliente não informado"));
        if(requestDTO.getItems() == null)
            return ResponseEntity.badRequest().body(new Exception("Cliente não informado"));

            Request requestEntity = new Request();
            requestEntity.setDtRequest(requestDTO.getDtRequest());
            requestEntity.setIdClient(requestDTO.getIdClient());
            requestEntity.setVlRequest(requestDTO.getVlRequest());
            requestEntity.setVlFreight(requestDTO.getVlFreight());
            requestEntity.setDs_payment(requestDTO.getDs_payment());
            requestEntity.setDtUpdate(new Date());

            List<ItemRequest> listItems = new ArrayList<>();
            for(ItemRequestDTO itRequest : requestDTO.getItems()){
                ItemRequest ir = new ItemRequest();
                ir.setVlProduct(itRequest.getVlProduct());
                ir.setQuant(itRequest.getQuant());
                ir.setCodProduct(itRequest.getCodRequest());
                ir.setVlfreight(itRequest.getVlFreight());

                listItems.add(ir);
            }

            requestEntity.setItemRequest(listItems);

            Request returnEntity = repository.save(requestEntity);

            RequestDTO returnDTO = new RequestDTO();
            requestDTO.setCodRequest(requestEntity.getCodRequest());
            return ResponseEntity.ok().body(requestDTO);
        }
}
