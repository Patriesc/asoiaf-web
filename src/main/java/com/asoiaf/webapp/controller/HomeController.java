package com.asoiaf.webapp.controller;


import com.asoiaf.webapp.authentication.ManagerUserSession;
import com.asoiaf.webapp.model.Usuario;
import com.asoiaf.webapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    ManagerUserSession managerUserSession;


    @GetMapping("/")
    public String about(Model model, HttpSession session) {
        Long idUsuarioLogeado = managerUserSession.usuarioLogeado();
        if(idUsuarioLogeado == null){
            model.addAttribute("usuario", null);
            return "index";
        }
        Usuario usuario = usuarioService.findById(idUsuarioLogeado);
        model.addAttribute("usuario", usuario);

        return "index";
    }

}