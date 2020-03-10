package bf.com.rd.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bf.com.rd.ecommerce.model.Usuario;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByFirstName (String firstName);
    List<Usuario> findByLastName(String lastName);
    List<Usuario> findByAge (Integer age);



}
