package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codRequest;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUpdate;

    @Column(name = "dt_request")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRequest;

    @Column(name = "id_client")
    private Integer idClient;

    @Column(name = "vl_request")
    private BigDecimal vlRequest;

    @Column(name = "vl_freight")
    private BigDecimal vlFreight;

    @Column(name = "ds_payment")
    private String ds_payment;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codRequest")
    private List<ItemRequest> itemRequest;

}
