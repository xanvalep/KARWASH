package com.co.karwash.entidades;


import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;
import javax.persistence.Table;


@Data
@Entity 
@Table(name = "persona")
public  class Persona implements Serializable {
    @Id
    private Integer idpersona;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String usuario;
    private String password;
}
