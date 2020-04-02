package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.NF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NFRepository extends JpaRepository<NF, Long>{

}
