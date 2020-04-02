package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_NF")
public class NF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JoinColumn(name = "num_NF")
    private Integer numNf;

    @Column(name = "dt_NF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNF;
}
