
package com.patinaje.v1.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.patinaje.v1.Model.UsuarioModel;
import com.patinaje.v1.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public interface UsuarioService {

  
    List<UsuarioModel> mostrarTodos() ;

    Optional<UsuarioModel> mostrarPorId(Long id) ;
}