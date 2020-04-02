//package br.com.rd.ecommerce.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//
//@Table(name = "tb_address")
//public class Address {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotNull
//    @Column(name = "num_telephone")
//    private String numTelefone;
//
//    @NotNull
//    @Column(name = "num_zipcode")
//    private String numZipcode;
//
//    @NotNull
//    @Column(name = "public_place")
//    private String publicPlace;
//
//    @NotNull
//    @Column(name = "num_residence")
//    private Integer numResidence;
//
//    @NotNull
//    @Column(name = "ds_complement")
//    private String dscomplement;
//
//    @NotNull
//    @Column(name = "ds_reference")
//    private String dsReference;
//
//    @NotNull
//    @Column(name = "district")
//    private String district;
//
//    @NotNull
//    @Column(name = "city")
//    private String city;
//
//    @NotNull
//    @Column(name = "ds_uf")
//    private String dsUf;
//
//    @NotNull
//    @Column(name = "id_fornecedor")
//    private Integer idFornecedor;
//}
