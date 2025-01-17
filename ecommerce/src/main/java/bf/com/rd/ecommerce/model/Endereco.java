package bf.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_endereco")

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_endereco;
    @NotNull
    @Column(name = "endereco",length=100)
    private String endereco;
    @NotNull
    @Column(name = "numero_endereco",length=6)
    private String numeroEndereco;
    @NotNull
    @Column(name = "cep_endereco",length=8)
    private String cep;
    @NotNull
    @Column(name = "cidade_endereco",length=80)
    private String cidade;
    @NotNull
    @Column(name = "estado_endereco",length=2)
    private String estado;
}

