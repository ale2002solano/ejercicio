package hn.unah.lenguajes.ejercicio.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.ejercicio.modelos.Usuario;
import hn.unah.lenguajes.ejercicio.servicios.Impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario) {
        if(nuevoUsuario.getPerfil() !=null){
            nuevoUsuario.getPerfil().setUsuario(nuevoUsuario);
      }
      return this.usuarioServiceImpl.crearUsuario(nuevoUsuario);
    }

    @PostMapping("/eliminar")
    public String eliminarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioServiceImpl.eliminarUsuario(usuario.getCodigoUsuario());
    }

    @PostMapping("/eliminar/{codigoUsuario}")
    public String eliminarUsuario(@PathVariable(name="codigoUsuario")String codigoUsuario) {
        return this.usuarioServiceImpl.eliminarUsuario(codigoUsuario);
    }

    @PostMapping("/buscar")
    public Boolean buscarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioServiceImpl.buscarUsuario(usuario.getCodigoUsuario());
    }

    @PostMapping("/buscar/{codigoUsuario}")
    public Boolean buscarUsuario(@PathVariable(name="codigoUsuario")String codigoUsuario) {
        return this.usuarioServiceImpl.buscarUsuario(codigoUsuario);
    }

    @PostMapping("/obtenerTodos")
    public List<Usuario> obtenerTodosUsuario() {
        return this.usuarioServiceImpl.obtenerTodosUsuario();
    }
}
