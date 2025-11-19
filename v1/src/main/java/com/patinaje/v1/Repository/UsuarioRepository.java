package com.patinaje.v1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patinaje.v1.Model.UsuarioModel;




@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
   
}