package br.com.rd.ecommerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDTO {

    private BigDecimal vlProduct;
    private Integer quant;
    private Integer codRequest;
    private Date dtRequest;
    private Integer idClient;
    private BigDecimal vlRequest;
    private BigDecimal vlFreight;
    private String ds_payment;
    private Integer codProduct;
}
