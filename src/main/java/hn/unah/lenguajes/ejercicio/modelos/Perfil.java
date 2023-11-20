package hn.unah.lenguajes.ejercicio.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="perfil")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Perfil {
    @Id
    @Column(name="idPerfil")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idPerfil;

    @Column(name="rol")
    private String rol;

    @Column(name="descripcion")
    private String descripcion;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name="codigoUsuario", referencedColumnName = "codigoUsuario")
    private Usuario usuario;
}
