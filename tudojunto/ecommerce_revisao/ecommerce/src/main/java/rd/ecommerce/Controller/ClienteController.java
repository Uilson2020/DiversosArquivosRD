package rd.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rd.ecommerce.Model.Cliente;
import rd.ecommerce.Repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listar(){
        List<Cliente> clientes = repository.findAll();
        return ResponseEntity.status(200).body(clientes);
    }

    @PostMapping("/clientes")
    public ResponseEntity<?> adicionar(@RequestBody Cliente cliente){
        if (cliente == null) {
            return ResponseEntity.status(400).body("Clinte não pode estr vazio");
        }

        Cliente clienteAtualizado = repository.save(cliente);
        return ResponseEntity.status(201).body(clienteAtualizado);
//        return  new ResponseEntity<>(repository.save(cliente), HttpStatus.HttpStatus.CREATED);
    }

    @GetMapping("/clientes/{id")
    public ResponseEntity<?> mostar(@PathVariable("id") Long id){
        Optional<Cliente> opt_cliente = repository.findById(id);

        Cliente cliente = opt_cliente.orElse(null);
        if (cliente == null){
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(cliente);
//        return ResponseEntity.ok().body(repository.findById(id));
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<?> modificar(@PathVariable("id")Long id, @RequestBody Cliente clienteDetails){

        if (clienteDetails == null){
            return  ResponseEntity.status(400).body("O cliente não pode ser vazio");
        }
        try{
            Cliente cliente = repository.findById(id).orElse(null);

            if (cliente == null){
                return ResponseEntity.status(404).body("O cliente não foi encontrado");
            }

            if (clienteDetails.getRg() != null){
                cliente.setRg(clienteDetails.getRg());
            }

            if (clienteDetails.getTelefone() != null){
                cliente.setTelefone(clienteDetails.getTelefone());
            }

            if (clienteDetails.getNome() != null){
                cliente.setNome(clienteDetails.getNome());
            }

            if (clienteDetails.getCpf() != null){
                cliente.setCpf(clienteDetails.getCpf());
            }

            if (clienteDetails.getEmail() != null){
                cliente.setEmail(clienteDetails.getEmail());
            }

            Cliente response = repository.save(cliente);

            return ResponseEntity.status(200).body(response);
        } catch (Exception ex){
            return ResponseEntity.status(500).body("Erro inesperado");
        }
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<?> remover(@PathVariable("id") Long id){
        return repository.findById(id).map(cliente -> {
            repository.delete(cliente);
            return ResponseEntity.status(204).body("Cliente excluido");
        }).orElse(ResponseEntity.status(404).build());
    }

}

