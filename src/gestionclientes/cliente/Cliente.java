/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionclientes.cliente;

import java.util.Date;

/**
 *
 * @author Dams2
 */
public class Cliente {
    
    private String nombre;
    private String apellidos;
    private Date fecha;
    private String provincia;

    
    
    public String[] valores(){
        
        
        return null;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Cliente(String nombre, String apellidos, Date fecha, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.provincia = provincia;
    }
    
    public String[] toArrayString(){
    
    String[] str = new String[4];
    str[0]=nombre;
    str[1]=apellidos;
    str[2]=fecha.toString();
    str[3]=provincia;
    
    return str;
    
    }
    
    
    
    
}
