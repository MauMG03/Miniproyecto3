/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mauricio.munoz
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String fecha;
    private int id;
    private String idTipo;
    private ArrayList <Direccion> direcciones;
    private ArrayList <Telefono> telefonos;
    private Map <String, Integer> contacto;
    
    public Persona(){
        nombre = "";
        apellidos = "";
        fecha = "";
        idTipo = "";
        id = 0;
        direcciones = new ArrayList<Direccion>();
        telefonos = new ArrayList<Telefono>();
        contacto = new HashMap();
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public Map<String, Integer> getContacto() {
        return contacto;
    }

    public void setContacto(Map<String, Integer> contacto) {
        this.contacto = contacto;
    }
}
