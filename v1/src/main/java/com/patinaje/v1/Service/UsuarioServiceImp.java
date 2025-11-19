package com.patinaje.v1.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.patinaje.v1.Repository.UsuarioRepository;
import com.patinaje.v1.Model.Usuario;






@Service
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> mostrarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> mostrarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

}