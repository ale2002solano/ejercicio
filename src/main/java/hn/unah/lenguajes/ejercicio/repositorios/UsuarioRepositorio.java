package hn.unah.lenguajes.ejercicio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.ejercicio.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario,String>{

    
}
