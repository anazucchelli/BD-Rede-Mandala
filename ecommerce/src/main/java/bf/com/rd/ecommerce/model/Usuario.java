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
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    @NotNull
    @Column(name = "email_usuario",length=100)
    private String emailUsuario;
    @NotNull
    @Column(name = "senha_usuario",length=45)
    private String senhaUsuario;
    @NotNull
    @Column(name = "nome_usuario",length=80)
    private String nomeUsuario;
    @NotNull
    @Column(name = "cpf",length=11)
    private String cpf;
    @NotNull
    @Column(name = "data_Nascimento")
    private Date dataNascimento;

}
