package hn.unah.lenguajes.ejercicio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.ejercicio.modelos.Perfil;

public interface PerfilRepositorio extends JpaRepository<Perfil,Integer>{

    
}
