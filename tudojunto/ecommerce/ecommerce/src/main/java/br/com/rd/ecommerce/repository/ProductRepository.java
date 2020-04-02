package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCodProductAndDescription(Long codProduct, String description);
    public List<Product> findByDescription( String description);
}
