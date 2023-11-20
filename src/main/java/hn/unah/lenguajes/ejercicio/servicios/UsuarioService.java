package hn.unah.lenguajes.ejercicio.servicios;



import java.util.List;

import hn.unah.lenguajes.ejercicio.modelos.Usuario;

public interface UsuarioService {
    public Usuario crearUsuario(Usuario usuario);
    public String eliminarUsuario(String id);
    public Boolean buscarUsuario(String id);
    public List<Usuario> obtenerTodosUsuario();
}
