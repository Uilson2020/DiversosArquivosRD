package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codProduct;

    @Column(name = "ds_product", nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "cd_category")
    private Category category;

    @Column(name = "vl_product")
    private Long vlProduct;
}
