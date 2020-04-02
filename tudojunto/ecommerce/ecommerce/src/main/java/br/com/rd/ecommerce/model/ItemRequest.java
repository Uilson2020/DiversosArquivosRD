package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_item_request")
public class ItemRequest {

    @Id
    @Column(name = "cd_item_request")

    private Integer cod;

    @Column(name = "vl_product")
    private BigDecimal vlProduct;

    @Column(name = "vl_freight")
    private BigDecimal vlfreight;

    @Column(name = "quant")
    private Integer quant;

    @Column(name = "cd_product")
    private Integer codProduct;

//    @ManyToOne
//    @JoinColumn(name = "cod_request")
//    private  Request request;
}
