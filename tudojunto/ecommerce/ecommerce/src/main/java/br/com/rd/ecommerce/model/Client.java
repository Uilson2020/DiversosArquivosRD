//package br.com.rd.ecommerce.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.w3c.dom.Text;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "tb_cliente")
//public class Client {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotNull
//    @Column(name = "name_client")
//    private String name;
//
//    @NotNull
//    @Column(name = "num_cpf")
//    private Integer numCpf;
//
//    @NotNull
//    @Column(name = "email")
//    private String email;
//
//    @NotNull
//    @Column(name = "password")
//    private String password;
//
//    @NotNull
//    @Column(name = "birth_date")
//    private Date birthdate;
//
//    @NotNull
//    @Column(name = "sex")
//    private Character sex;
//
//}
//
