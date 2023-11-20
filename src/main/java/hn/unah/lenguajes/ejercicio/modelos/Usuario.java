package hn.unah.lenguajes.ejercicio.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usuarios")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name="codigoUsuario")
    private String codigoUsuario;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellidos")
    private String apellidos;

    @Column(name="departamento")
    private String departamento;

    @Column(name="correo")
    private String correo;

    @Column(name="telefono")
    private String telefono;

    @OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL)
    private Perfil perfil;
}
