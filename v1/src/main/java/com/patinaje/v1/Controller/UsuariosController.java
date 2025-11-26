package com.patinaje.v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.patinaje.v1.Service.UsuarioServiceImp;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuarioServiceImp usuarioServiceImp;


    @RequestMapping({"/listar"})
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioServiceImp.mostrarTodos());
        return "usuarios/listarusuarios";
    }
    
}

