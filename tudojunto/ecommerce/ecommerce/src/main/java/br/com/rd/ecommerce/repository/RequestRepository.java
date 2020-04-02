package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    Request save(Request request);
}
