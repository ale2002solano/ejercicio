package hn.unah.lenguajes.ejercicio.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.ejercicio.modelos.Usuario;
import hn.unah.lenguajes.ejercicio.repositorios.UsuarioRepositorio;
import hn.unah.lenguajes.ejercicio.servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario crearUsuario(Usuario usuario) {

        return usuarioRepositorio.save(usuario);
        
    }

    @Override
    public String eliminarUsuario(String id) {
        Usuario usuarioEliminar = this.usuarioRepositorio.findById(id).get();  
        
        if(usuarioEliminar != null){
            this.usuarioRepositorio.delete(usuarioEliminar);
            return "Usuario eliminado"+ usuarioEliminar.getCodigoUsuario();
        }
        return "No existe usuario a eliminar";
    }

    @Override
    public Boolean buscarUsuario(String id) {
        return usuarioRepositorio.existsById(id);
    }

    @Override
    public List<Usuario> obtenerTodosUsuario() {
            return usuarioRepositorio.findAll();
        }
    
}
