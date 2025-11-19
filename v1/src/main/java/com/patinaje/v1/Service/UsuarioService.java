import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.patinaje.v1.Model.Usuario;
import com.patinaje.v1.Repository.UsuarioRepository;

package com.patinaje.v1.Service;




@Service
public interface UsuarioService {

  
    List<Usuario> mostrarTodos() ;

    Optional<Usuario> mostrarPorId(Long id) ;
}