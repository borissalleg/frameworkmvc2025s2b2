package com.patinaje.v1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;

@Entity
@Table(name = "tbl_usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdUsuario;

    @Column(name = "nombre", nullable = true, length = 50)
    String NombreUsuario;

    @Column(name = "contraseña", nullable = true, length = 50)
    String Contrasena; 
    
}
