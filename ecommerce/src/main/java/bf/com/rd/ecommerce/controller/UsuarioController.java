package bf.com.rd.ecommerce.controller;

import bf.com.rd.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import bf.com.rd.ecommerce.model.Usuario;
import bf.com.rd.ecommerce.repository.UserRepository;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/usuario")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}

