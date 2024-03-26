/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.EjemplorSprintt;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mintic.misiontic.ciclo3.modelo.Usuario;


/**
 *
 * @author Juanka
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio(Model modelo){
        
        String mensaje = "SALUDOS DESDE MVC con paso de informacion";
        modelo.addAttribute("mensaje",mensaje);
        modelo.addAttribute("dato",dato);
        Usuario u1 = new Usuario();
        u1.setCedula("1007260380");
        u1.setClave("Juan2003");
        u1.setNombre("Juan Camilo Gaviria");
        u1.setEmail("juancgaviria2003@gmail.com");
        modelo.addAttribute("alguien",u1);
        
        Usuario u2 = new Usuario();
        u2.setCedula("45540000");
        u2.setClave("Regina45540000");
        u2.setNombre("Regina Marimon");
        u2.setEmail("r.marimonv@gmail.com");
        
        Usuario u3 = new Usuario();
        u3.setCedula("7382150");
        u3.setClave("laojona17");
        u3.setNombre("Mesi Manuel Guerra");
        u3.setEmail("meismanuelguerra@gmail.com");
        
        List<Usuario> ListaUsuario = Arrays.asList(u2,u3);
        modelo.addAttribute("Usuario",ListaUsuario);
        
        
        log.info("Ejecutando el controlador inicio");
        return "index";
    }
    
}
