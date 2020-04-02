//package br.com.rd.ecommerce.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name="tb_products")
//public class Products {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer codProduct;
//
//    @Column(name = "ds_title", nullable = false)
//    private String description;
//
//    @ManyToOne
//    @JoinColumn(name = "manufacturer")
//    private String manufacturer;
//
//    @Column(name = "ds_color")
//    private String ds_color;
//
//    @Column(name = "value")
//    private Double value;
//
//}
