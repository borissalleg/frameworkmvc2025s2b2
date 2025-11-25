package com.patinaje.v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    UsuarioServiceImp usuarioServiceImp;


    @RequestMapping({"/listar"})
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioServiceImp.mostrarTodos());
        return "listarusuarios";
    }
    
}

